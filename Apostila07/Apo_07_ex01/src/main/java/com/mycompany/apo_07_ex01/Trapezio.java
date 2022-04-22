/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apo_07_ex01;

/**
 *
 * @author bohrs
 */
public class Trapezio extends Figura{
    
    private Double altura;
    private Double baseMaior;
    private Double baseMenor;
    private Double lado1;
    private Double lado2;
    
    public Trapezio(Double Altura, Double BaseMaior,Double BaseMenor, Double Lado1, Double Lado2)
    {
        this.altura=Altura;
        this.baseMaior=BaseMaior;
        this.baseMenor=BaseMenor;
        this.lado1=Lado1;
        this.lado2=Lado2;
    
    }
    
    @Override
    public Double Area()
    {
        return ((this.baseMaior+this.baseMenor)*this.altura)/2.0;
    
    
    }
    
    @Override 
    public Double Perimetro()
    {
        return this.baseMaior+this.baseMenor+
                    this.lado1+this.lado2;
    
    }
    
}
