/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.impressora;

/**
 *
 * @author bohrs
 */
public class Impressora {

    public void Exibir(float nroFloat)
    {
        System.out.println(nroFloat);
    }

    public void Exibir(float nroFloat, float nroFloat2)
    {
        System.out.println(nroFloat+","+nroFloat2);
    }

    public void Exibir(float nroFloat, String valor)
    {
        System.out.println(nroFloat+","+valor);
    }
    
    public void Exibir( String valor,float nroFloat)
    {
        System.out.println(valor+","+nroFloat);
    }

    public void Exibir( String valor,String valor2,String valor3)
    {
        System.out.println(valor2+","+valor+","+valor3);
    }

    public void Exibir( int nroInt,int nroInt1,String valor)
    {
        System.out.println(nroInt+","+nroInt1+","+valor);
    }



    
}
