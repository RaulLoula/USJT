/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

/**
 *
 * @author bohrs
 */
public class Calculadora {
    public int soma (int a, int b) {
        //usando uma variável para o resultado
        int resultado;
        resultado = a + b;
        return resultado;
    }
    
    public int subtracao (int a, int b) {
        //sem usar uma variável para o resultado
        return a - b;
    }
    
    public int multiplicacao (int a, int b) {
        return a * b;
    }
    
    public int divisao (int a, int b) {
        //note que aqui ocorre a divisão inteira
        return a / b;
    }
    
    //uma sobrecarga para o método soma
    public float soma (float a, float b) {
        return a + b;
    }

    public int soma (String a, String b) {
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        return n1 + n2;
    }
    
    public int soma (int a, int b, int c) {
        return a + b + c;
    }
    public int soma (String a, int b) {
        return Integer.parseInt(a) + b;
    }
    
    public int soma (int a, String b) {
        return a + Integer.parseInt(b);
    }
}
