/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apo_07_ex03;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bohrs
 */
public class Apo_07_ex03 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Gato gato = new Gato("Gato");
        Cachorro cao = new Cachorro("Cachorro");
        
        /*Todo esse código para exibir a acentução*/
        try {
            System.setOut(new PrintStream(System.out, true, "UTF8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Apo_07_ex03.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        System.out.println("Gato -> nome: "+gato.GetNome()+" patas: "+gato.GetPatas());        
        System.out.println("Cachorro -> nome: "+cao.GetNome()+" patas: "+cao.GetPatas());        
        
        
    }
}
