/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3ex2;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opc = 0;
        String nome, marca,  msg="";
        int codigo;
        Pessoa pessoaSelecionada = null;
        Pessoa dono = null;
        Pessoa novoDono = null;
        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Criar Pessoa \n"
                    + "2 – Criar Automóvel \n"
                    + "3 – Transferir Automóvel \n"
                    + "4 – Mostrar Todas as Pessoas\n"
                    + "5 – Mostrar automóvel da pessoa\n"
                    + "6 - Sair"
            ));
            if (opc == 2 ||  opc == 5) {
                pessoaSelecionada = buscarPessoa(pessoas);
                if (pessoaSelecionada == null) {
                    continue;
                }
            }

            if (opc == 3) {
                dono = buscarDono(pessoas);
                if (dono == null) {
                    continue;
                }
                novoDono = buscarNovoDono(pessoas);
                if (novoDono == null) {
                    continue;
                }
            }
            switch (opc) {
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
                    nome = JOptionPane.showInputDialog("Digite o nome ");
                    pessoas.add(new Pessoa(codigo, nome));
                    break;
                case 2:
                    marca = JOptionPane.showInputDialog("Digite a marca");
                    String modelo = JOptionPane.showInputDialog("Digite o modelo");
                    pessoaSelecionada.inserirAutomovel(new Automovel(marca, modelo));
                    break;
                case 3:
                    final String modelo2 = JOptionPane.showInputDialog("Digite o modelo do carro\n" + dono.imprimirCompleto());
                   // for (Automovel a : dono.getAutomoveis()) {
                      //  if (a.getModelo().equals(modelo)) {
                    Automovel a = dono.getAutomoveis().stream().filter(x -> x.getModelo().equals(modelo2)).findFirst().get();
                            dono.removerAutomovel(a);
                            novoDono.inserirAutomovel(a);
                      //  }                        
                   // }
                    break;
                case 4:
                    for (Pessoa p : pessoas){
                        msg += p.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, pessoaSelecionada.imprimirCompleto());
                    break;
                case 6:
                    break;
            }
        }
    }

    private static Pessoa buscarPessoa(ArrayList<Pessoa> pessoas) {
        String msg = "Selecione a pessoa pelo código\n";
        for (Pessoa p : pessoas) {
            msg += p.imprimir() + "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for (Pessoa p : pessoas) {
            if (p.getCodigo() == cod) {
                return p;
            }
        }
        return null;
    }
    
    private static Pessoa buscarDono(ArrayList<Pessoa> pessoas) {
        String msg = "Selecione o dono pelo código\n";
        for (Pessoa p : pessoas) {
            msg += p.imprimir() + "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for (Pessoa p : pessoas) {
            if (p.getCodigo() == cod) {
                return p;
            }
        }
        return null;
    }
    
    private static Pessoa buscarNovoDono(ArrayList<Pessoa> pessoas) {
        String msg = "Selecione o novo dono pelo código\n";
        for (Pessoa p : pessoas) {
            msg += p.imprimir() + "\n";
        }
        int cod = Integer.parseInt(JOptionPane.showInputDialog(msg));
        for (Pessoa p : pessoas) {
            if (p.getCodigo() == cod) {
                return p;
            }
        }
        return null;
    }
   
}
