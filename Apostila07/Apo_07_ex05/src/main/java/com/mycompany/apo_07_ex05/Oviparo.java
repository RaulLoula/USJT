/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apo_07_ex05;

/**
 *
 * @author bohrs
 */
public class Oviparo {
    
    private int NroOvos;
    private Boolean FecundacaoExterna;
    
    public Oviparo(int nroovos, Boolean fecundacaoexerta)
    {
        this.NroOvos=nroovos;
        this.FecundacaoExterna=fecundacaoexerta;
    }
    
    public int GetNroOvos()
    {
        return this.NroOvos;
    }
    
    public Boolean FecundacaoExterna()
    {
        return this.FecundacaoExterna;
    
    }
}
