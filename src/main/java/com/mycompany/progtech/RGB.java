/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtech;

/**
 *
 * @author Adam
 */
public class RGB extends ComputerPlus{
    public RGB(AComputer comp){
        super(comp);
    }
    
    @Override
    public String printPlus(){
        return "+ RGB";
    }
    
}
