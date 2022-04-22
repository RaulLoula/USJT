/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livrodenotas;

/**
 *
 * @author bohrs
 */


public class LivroDeNotas {

    private String nomeDoCurso;
     
    /*public void exibirMensagem (){
        System.out.println ("Bem-vindo ao livro de notas");
    }
    */
    
    public LivroDeNotas (String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }    
    
    public void exibirMensagem (){
        System.out.printf ("Bem-vindo ao livro de notas do curso %s",
        this.getNomeDoCurso());
    }
    
    public String getNomeDoCurso() {
        return nomeDoCurso;
    }
    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }    
    
}
