/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtech;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author Adam
 */
public class ObserverTest extends ObsSub {
    
    @Test
    public void Observer(){
        ObsSub garancia = new ObsSub();
        assertNotEquals(garancia, null);
        Observer2 obs = new Observer2();
        assertNotEquals(obs, null);
        Observer2 obs2 = new Observer2();
        assertNotEquals(obs2, null);
        garancia.register(obs);
        garancia.register(obs2);
        garancia.echoToAll();
        garancia.unregister(obs2);
        garancia.echoToAll();
    }
    
    
   
   
    
    
}
