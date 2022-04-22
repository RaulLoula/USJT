/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.carros;

/**
 *
 * @author bohrs
 */
public class Carros {


    
    private String Modelo;
    private String Cor;
    
    public Carros (String modelo, String cor){
        this.Modelo=modelo;
        this.Cor=cor;
    }    
     public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        this.Modelo = modelo;
    } 
    
     public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        this.Cor = cor;
    } 
    
    
    public void exibirAtributosCarro (){
        System.out.printf ("Modelo %s cor %s \n", this.getModelo(),this.getCor());
    }
    
}
