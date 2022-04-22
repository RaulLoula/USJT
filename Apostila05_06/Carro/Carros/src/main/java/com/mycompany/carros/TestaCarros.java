/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carros;

import javax.swing.JOptionPane;
/**
 *
 * @author bohrs
 */
public class TestaCarros {
     public static void main(String[] args) {
         
/*         String modelo = JOptionPane.showInputDialog ("Por favor, informe o modelo do possante.");
         String cor = JOptionPane.showInputDialog ("Por favor, informe a cor do carro.");
         Carros carro = new Carros();         
         carro.setModelo(modelo);
         carro.setCor(cor);
         carro.exibirAtributosCarro();
         
          modelo = JOptionPane.showInputDialog ("Por favor, informe o modelo do 2º possante.");
          cor = JOptionPane.showInputDialog ("Por favor, informe a cor do 2º carro.");
         
         Carros carro1 = new Carros();
         
         carro1.setModelo(modelo);
         carro1.setCor(cor);
         carro1.exibirAtributosCarro();         */

        Carros carro = new Carros("Clio","Prata");         
        carro.exibirAtributosCarro();
        
        Carros carro1 = new Carros("Ferrari","Amarela");
        carro1.exibirAtributosCarro();

         
     }
     
}
