/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadoracientifica;

/**
 *
 * @author bohrs
 */
public class CalculadoraCientifica {

    public Double Raiz(int Param)
    {
        return Math.sqrt(Param);
    }

    public Double Raiz(Double Param)
    {
        return Math.sqrt(Param);
    }
    
    public Double Raiz(String Param)
    {
        return Math.sqrt(Double.parseDouble(Param));
    }
    

    public Double Potencia( Byte a, Byte b)
    {
        return Math.pow(a, b);
    
    }

    public Double Potencia( String a, String b)
    {
        return Math.pow(Double.parseDouble(a),Double.parseDouble(b));
    
    }

    public Double Potencia( int a, double b)
    {
         return Math.pow(a, b);
    
    }

    
}
