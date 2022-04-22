package com.mycompany.apo_07_ex02;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bohrs
 */
public class Cubo extends Figura3D{
    
    private Double lado;
    
    public Cubo(Double Lado)
    {
        this.lado=Lado;
    }
    
    @Override
    public Double Volume()
    {
        return Math.pow(this.lado, 3);
    
    }
    
}
