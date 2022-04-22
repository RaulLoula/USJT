/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livrodenotas;
import javax.swing.JOptionPane;
        
/**
 *
 * @author bohrs
 */
public class TesteLivroDeNotas {
    public static void main(String[] args) {
        //LivroDeNotas livroDeNotas = new LivroDeNotas();
        //livroDeNotas.exibirMensagem();        
        //String nomeDoCurso = JOptionPane.showInputDialog ("Prof, qual o nome do curso?");
        //livroDeNotas.exibirMensagem(nomeDoCurso);        
        //LivroDeNotas livroDeNotas = new LivroDeNotas("Tretas muito loucas");
        //livroDeNotas.setNomeDoCurso(nomeDoCurso);
        //livroDeNotas.exibirMensagem();        
        
        
        String primeiroCurso = JOptionPane.showInputDialog ("Prof, qual o nome do primeiro curso?");
        String segundoCurso = JOptionPane.showInputDialog("Prof. qual o nome do segundo curso?");
        LivroDeNotas livroDeNotas1 = new LivroDeNotas(primeiroCurso);
        LivroDeNotas livroDeNotas2 = new LivroDeNotas (segundoCurso);
        livroDeNotas1.exibirMensagem();
        livroDeNotas2.exibirMensagem();        
        
        
    }
}