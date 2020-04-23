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
abstract public class ComputerPlus extends AComputer
{
    protected AComputer computer;
    public ComputerPlus(AComputer computer){
        this.computer = computer;
    }
    
    @Override
    public String print() {
        return computer.print() + printPlus();
    }
    
    public abstract String printPlus();
    
}
