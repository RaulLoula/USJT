/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apo_07_ex02;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bohrs
 */
public class Apo_07_ex02 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Quadrilatero quadrilatero = new Quadrilatero(5.0,4.0,5.0,5.0);
        Cubo cubo = new Cubo(3.8);
        Esfera esfera = new Esfera(4.2);
        

        /*Todo esse código para exibir a acentução*/
        try {
            System.setOut(new PrintStream(System.out, true, "UTF8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Apo_07_ex02.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    System.out.println("Quadrilatero -> primêtro: "+quadrilatero.Perimetro()+" área: "+quadrilatero.Area());        
    System.out.println("Cubo -> volume: "+cubo.Volume());        
    System.out.println("Esfera -> esfera: "+esfera.Volume());        
        
        
    }
}
