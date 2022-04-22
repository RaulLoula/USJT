/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apo_07_ex01;

/**
 *
 * @author bohrs
 */
public class Retangulo extends Figura{
    
    private double base;
    private double altura;
            
    public Retangulo(double Base, double Altura)
    {
        this.base=Base;
        this.altura=Altura;
    }
    
    @Override            
    public Double   Area(){
    
        return this.base*this.altura ;
    
    }
    @Override
    public Double Perimetro()
    {
        return 2*this.altura+ 2*this.base;
    
    }        
    
}
