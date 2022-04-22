package com.mycompany.apo_07_ex02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bohrs
 */
public class Quadrilatero extends Figura2D {
    
    public Double lado1;
    public Double lado2;
    public Double lado3;
    public Double lado4;
    
    public Quadrilatero(Double Lado1,Double Lado2,Double Lado3,Double Lado4 )
    {
        this.lado1=Lado1;
        this.lado2=Lado2;
        this.lado3=Lado3;
        this.lado4=Lado4;

    }
    
    @Override
    public Double Area()
    {
        return this.lado1*this.lado2;
    }
    @Override
    public Double Perimetro()
    {
     return this.lado1+this.lado2+this.lado3+this.lado4;   
    }
    
    
}
