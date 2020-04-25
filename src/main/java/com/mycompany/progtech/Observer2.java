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
public class Observer2 implements IObserver {
    private boolean boolVar;

    public boolean isBoolVar() {
        return boolVar;
    }

    public void setBoolVar(boolean boolVar) {
        this.boolVar = boolVar;
    }
    
    public Observer2() {
        this.boolVar = boolVar;
    }

    @Override
    public void update() {
        boolVar = true;
    }
    
}
