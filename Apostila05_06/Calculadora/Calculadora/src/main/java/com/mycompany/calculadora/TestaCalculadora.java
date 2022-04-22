/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author bohrs
 */
public class TestaCalculadora {
        public static void main(String[] args) {
            //1º Implementação
        /*//construindo uma calculadora
        Calculadora c = new Calculadora();
        //o que o usuário quer?
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao"));
        
        //quais os operandos?
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro operando?"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo operando?"));
        //para guardar o resultado
        int resultado;
        if (opcao == 1) {
            resultado = c.soma(operando1, operando2);
        }       
        else if (opcao == 2) {
            resultado = c.subtracao(operando1, operando2);
        }
        else if (opcao == 3) {
            resultado = c.multiplicacao(operando1, operando2);
        }
        else {
            resultado = c.divisao(operando1, operando2);
        }   
        //mostrando o resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        */
        // Testando a sobrecarga
        Calculadora c = new Calculadora();
        //operandos
        int x = 1, y = 2, z = 3;
        String s1 = "50", s2 = "60";
        float f1 = 56.7f, f2 = 0.3f;
        //somando dois números reais
        System.out.println(c.soma(f1, f2));
        //somando dois inteiros
        System.out.println(c.soma(x, y));
        //somando inteiro e string
        System.out.println(c.soma(x, s1));
        //somando string e inteiro
        System.out.println(c.soma(s1, x));
        //somando string e string
        System.out.println(c.soma(s1, s2));
        //somando três inteiros
        System.out.println(c.soma(x, y, z));
    }
}
