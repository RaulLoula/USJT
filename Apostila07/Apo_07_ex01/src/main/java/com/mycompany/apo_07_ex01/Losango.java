/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apo_07_ex01;

/**
 *
 * @author bohrs
 */
public class Losango extends Figura {
    
    private Double lado;
    private Double diagonalmaior;
    private Double diagonalmenor;
    
    public Losango(Double Lado, Double DiagonalMaior, Double DiagonalMenor)
    {
        this.lado=Lado;
        this.diagonalmaior=DiagonalMaior;
        this.diagonalmenor=DiagonalMenor;
    }

    @Override
    public Double Area()
    {
    return (this.diagonalmaior*this.diagonalmenor)/2.0;
    }
    
    @Override
    public Double Perimetro()
    {
        return 4*this.lado;
    
    }
            
    
}
