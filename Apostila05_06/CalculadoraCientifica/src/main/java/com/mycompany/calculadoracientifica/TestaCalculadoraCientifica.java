/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracientifica;

/**
 *
 * @author bohrs
 */
public class TestaCalculadoraCientifica {
    
    public static void main(String[] args) {
        
        CalculadoraCientifica calc = new CalculadoraCientifica();
        
        System.out.println(calc.Raiz(100));        
        System.out.println(calc.Raiz(100.40));        
        System.out.println(calc.Raiz("1000"));        
        
        System.out.println(calc.Potencia(5,2));        
        System.out.println(calc.Potencia("3","4"));        
        System.out.println(calc.Potencia(5,2.5));        
        
        
    }
    
}
