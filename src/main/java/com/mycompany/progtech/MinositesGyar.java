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

abstract class MinositesGyar
{
    public Minosites Create(){
        return Minosit();
    }
 
    public abstract Minosites Minosit();
}

class MinositesGamer extends MinositesGyar{
    @Override
    public Minosites Minosit() {
        return new GamerFactory(); 
    }
}

class MinositesOffice extends MinositesGyar
{
    @Override
    public Minosites Minosit() {
        return new OfficeFactory();
    }
}


interface Minosites {
    AComputer Minosit(AComputer computer); 
}


class GamerFactory implements Minosites //Amin
{
    public AComputer Minosit(AComputer computer) { 
        computer = new RGB(computer);
        return computer;
    }
}

class OfficeFactory implements Minosites //Bmin
{
    public AComputer Minosit(AComputer computer) { 
        computer = new KulsoDvdOlvaso(computer);
        return computer;
    }
}