/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3ex1;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        int opc = 0;
        String nome, ra,  msg="";
        int codigo, cargaHoraria;
        Curso cursoSelecionado = null;
        Curso curso=null;
        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Criar Curso \n"
                    + "2 – Criar Aluno \n"
                    + "3 – Remover Aluno\n"
                    + "4 – Mostrar Todos os cursos\n"
                    + "5 – Mostrar alunos do curso\n"
                    + "6 - Sair"
            ));
            
            if(opc==2 || opc == 5){
                cursoSelecionado = buscarCurso(cursos);
                if(cursoSelecionado == null){
                    continue;
                }
            }
            
            if (opc == 3) {
                curso = buscarCursoAluno(cursos);
                if (curso == null) {
                    continue;
                }
            }
            
            switch (opc) {
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
                    nome = JOptionPane.showInputDialog("Digite o nome ");
                    cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaria do curso"));
                    cursos.add(new Curso(codigo, nome, cargaHoraria));
                    break;
                case 2:
                    ra = JOptionPane.showInputDialog("Digite o seu Ra");
                    nome = JOptionPane.showInputDialog("Digite o seu nome");
                    cursoSelecionado.inserirAluno(new Aluno(ra, nome));
                    break;
                case 3:
                    final String raAluno = JOptionPane.showInputDialog("Digite o ra do aluno\n" + curso.imprimirCompleto());
                   // for (Automovel a : dono.getAutomoveis()) {
                      //  if (a.getModelo().equals(modelo)) {
                    Aluno a = curso.getAlunos().stream().filter(x -> x.getRa().equals(raAluno)).findFirst().get();
                            curso.removerAluno(a);
                      //  }                        
                   // }
                    break;
                case 4:
                    for (Curso c : cursos){
                        msg += c.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 5:
                       JOptionPane.showMessageDialog(null, cursoSelecionado.imprimirCompleto());                  
                    break;
                case 6:
                    break;
            }
        }
    }

    private static Curso buscarCurso(ArrayList<Curso> cursos) {
        String msg = "Selecione o curso pelo código\n";
        for (Curso c : cursos) {
            msg += c.imprimir() + "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for (Curso c : cursos) {
            if (c.getCodigo() == cod) {
                return c;
            }
        }
        return null;
    }

    private static Curso buscarCursoAluno(ArrayList<Curso> cursos) {
        String msg = "Selecione o curso pelo codigo\n";
        for (Curso c : cursos) {
            msg += c.imprimir()+ "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for (Curso c : cursos) {
            if (c.getCodigo() == cod) {
                return c;
            }
        }
        return null;
    }
    
   
}
