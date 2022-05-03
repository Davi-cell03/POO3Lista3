/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3ex2;

/**
 *
 * @author aluno
 */
public class Automovel {
    private String marca;
    private String modelo;

    public Automovel() {
    }

    public Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String imprimir(){
        return "Marca: " + marca + "\nModelo: " + modelo;
    }
}
