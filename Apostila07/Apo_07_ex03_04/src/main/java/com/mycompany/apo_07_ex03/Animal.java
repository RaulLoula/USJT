/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apo_07_ex03;

/**
 *
 * @author bohrs
 */
public class Animal {
    
    private String Nome;
    private int Patas;
    
    public void SetNome(String nome)
    {
        this.Nome=nome;    
    }
    
    public void SetPatas(int patas)
    {
        this.Patas=patas;
    }
    
    public String GetNome()
    {
        return this.Nome;
    }
    
    public int GetPatas()
    {
        return this.Patas;
    
    }
    
    public Animal()
    {
        this.Nome="";
        this.Patas=0;
    
    }
    
    public Animal(String nome )
    {
        this.Nome=nome;
        this.Patas=0;
        
    }
    
    public Animal(String nome, int patas )
    {
        this.Nome=nome;
        this.Patas=patas;
        
    }
    
    
    
    
}
