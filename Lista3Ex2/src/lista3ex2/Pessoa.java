/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3ex2;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis;

    public Pessoa() {
        automoveis = new ArrayList<>();
    }

    public Pessoa(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }    
    
    public void inserirAutomovel(Automovel automovel){
        automoveis.add(automovel);
    }
    
     public void removerAutomovel(int index){
        automoveis.remove(index);
    }
    
    public void removerAutomovel(Automovel automovel){
        automoveis.remove(automovel);
    }
    
    public String imprimir(){
        return "Codigo: " + codigo + " - " + nome;
    }
    
    public String imprimirCompleto(){
        String msg = imprimir() + "\n\n Automoveis: \n";
        for(Automovel automovel : automoveis){
            msg += automovel.imprimir() + '\n';
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

    public ArrayList<Automovel> getAutomoveis() {
            return automoveis;
    }
    
    
}
