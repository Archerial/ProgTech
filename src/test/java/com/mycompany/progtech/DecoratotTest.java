package com.mycompany.progtech;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam
 */
public class DecoratotTest {
    
    AComputer testAComp;
    
    @Test
    public void testRGB(){
        RGB testACompRgb = new RGB(testAComp);
        System.out.println(testACompRgb.printPlus());
        assertEquals(" + RGB",testACompRgb.printPlus());
    }
    
    @Test
    public void testKulsoDvdOlvaso(){
        KulsoDvdOlvaso testACompLulsoDvdOlvaso = new KulsoDvdOlvaso(testAComp);
        System.out.println(testACompLulsoDvdOlvaso.printPlus());
        assertEquals(" + Külső DVD olvasó",testACompLulsoDvdOlvaso.printPlus());
    }
}       
          
