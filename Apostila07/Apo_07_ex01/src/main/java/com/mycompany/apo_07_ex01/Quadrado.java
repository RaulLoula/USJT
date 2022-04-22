/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apo_07_ex01;

/**
 *
 * @author bohrs
 */
public class Quadrado  extends Figura{
    
    private Double lado;
    public Quadrado(double Lado)
    {
        this.lado=Lado;
    }
    @Override
    public Double   Area(){
    
        return this.lado*this.lado;
    
    }
    @Override
    public Double Perimetro()
    {
        return 4*this.lado;
    
    }
}
