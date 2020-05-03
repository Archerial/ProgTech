/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtech;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Adam
 */
public class Logger {
    private static Logger logger = null;

    public int id = 0;
    
    public static synchronized Logger getInstance(){
    if(logger == null)
        logger = new Logger();
    return logger;
}

    private final String logFile = "log.txt";
    private PrintWriter writer;
    private Logger() 
    {
        try 
        {
            FileWriter fw = new FileWriter(logFile,true);
            writer = new PrintWriter(fw, true);
        }
        catch (IOException e) 
        {
            
        }
    }
    
    public void successfull (int price) 
    {
        id++;
        writer.println("A(z) (" + id + ")szamu rendeles ara: " + price + "Ft");
        System.out.println("A(z) (" + id + ")szamu rendeles ara: " + price + "Ft");
        
    }
    public void failure () 
    {
        id++;
        writer.println("A(z) (" + id + ") szamu rendeles hibas");
        System.out.println("A(z) (" + id + ") szamu rendeles hibas");
    }
    
    public void garancia(){
        writer.println("A rendeleshez plussz garancia rogzitve");
    }
    
    public void userAdatok(String knev, String vnev, int irszam, String telepules, String utcaHazSzam){
        writer.println("A megrendelo adatai: " + " Keresztneve: "+ knev + " Vezetekneve: " + vnev + " Iranyitoszam: " + irszam + " Telepules: " + telepules + " Utca es hazszam: " + utcaHazSzam);
    }
    
    public void complete(String pc, String extra){
        writer.println("A megrendelt szamitogep tipusa: " + pc + " melle valaszott extra: " + extra);
    }
    
    public void parts(AComputer acomputer, int ar){
        writer.println(" Az valasztott gep adatai: " + acomputer.print() + "  Ara: " + ar);
    }
    
    public void start(String tipus){
        writer.println(" A user "  + tipus + " tipusu vasarlast valasztott");
    }
    
}
