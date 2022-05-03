/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3ex1;

import java.util.ArrayList;

/**
 *
 * @author davi.dias
 */
public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList<>();
    }

    public Curso(int codigo, String nome, int CargaHoraria) {
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = CargaHoraria;
    }
    
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removerAluno(int index){
        alunos.remove(index);
    }
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public String imprimir(){
        return "Codigo: " + codigo + "\nNome: " + nome + "\nCarga Horaria: " + cargaHoraria;
    }
    
    public String imprimirCompleto(){
        String msg = imprimir() + "\n\n Alunos: \n";
        for(Aluno aluno : alunos){
            msg += aluno.imprimir() + '\n';
        }
        return msg;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
}
