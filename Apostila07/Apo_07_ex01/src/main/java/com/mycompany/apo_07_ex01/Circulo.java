/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apo_07_ex01;

/**
 *
 * @author bohrs
 */
public class Circulo extends Figura{
    
    private Double raio;
    
    public Circulo(Double Raio)
    {
        this.raio=Raio;
    }
    
    @Override
    public Double Area()
    {
        return Math.PI*(this.raio*this.raio);
    
    }
    @Override
    public Double Perimetro()
    {
        return 2*Math.PI*this.raio;
    
    }
            
    
}
