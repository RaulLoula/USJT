/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apo_07_ex01;

/**
 *
 * @author bohrs
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Apo_07_ex01 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(10, 5);
        Circulo circulo = new Circulo(1.5);
        Losango losango = new Losango(4.5, 5.0, 7.0);
        Trapezio trapezio = new Trapezio(10.1,5.0,8.0,8.5,9.5);

        /*Todo esse código para exibir a acentução*/
        try {
            System.setOut(new PrintStream(System.out, true, "UTF8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Apo_07_ex01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    System.out.println("Quadrado -> perimêtro: "+quadrado.Perimetro()+" área: "+quadrado.Area());        
    System.out.println("Retângulo -> perimêtro: "+retangulo.Perimetro()+" área: "+retangulo.Area());
    System.out.println("Círculo -> perimêtro: "+circulo.Perimetro()+" área: "+circulo.Area());
    System.out.println("Losango -> perimêtro: "+losango.Perimetro()+" área: "+losango.Area());
    System.out.println("Trapézio -> perimêtro: "+trapezio.Perimetro()+" área: "+trapezio.Area());            
    }
}
