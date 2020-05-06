/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtech;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam
 */
public class LoggerTest {
    
    Logger logger = Logger.getInstance();
    Logger logger2 = Logger.getInstance();
    
    //Valóban csak egy példány jön-e létre? (Singleton test)
    @Test
    public void testGetInstance() {
        System.out.println(logger);
        System.out.println(logger2);
        assertEquals(logger,logger2);
    }
    
    //A logger metódusainak tesztje
    @Test
    public void testSuccessfull() {
        logger.successfull(10);
    }

    @Test
    public void testFailure() {
        logger.failure();
    }

    @Test
    public void testGarancia() {
        logger.garancia();
    }

    @Test
    public void testUserAdatok() {
        logger.userAdatok("TestKnev", "TestVnev", 0, "TestTelepules", "TestutcaHazSzam");
    }

    @Test
    public void testComplete() {
        logger.complete("testPc", "testExtra");
    }

    @Test
    public void testStart() {
        logger.start("TestTipus");
    }
    
}
