package com.mycompany.apo_07_ex02;


import com.mycompany.apo_07_ex02.Figura3D;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bohrs
 */
public class Esfera extends Figura3D{
    
    public Double raio;
    
    public Esfera(Double Raio)
    {
        this.raio=Raio;
    }
    
    @Override
    public Double Volume()
    {
        return (4*Math.PI*Math.pow(this.raio, 3))/3.0;
        
    }
}
