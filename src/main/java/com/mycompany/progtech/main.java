package com.mycompany.progtech;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.lang.reflect.Constructor;
    
public class main {
 
    
   // The entry main() method
   public static void main(String[] args) {
      
      
      Logger logger = Logger.getInstance();
      AComputer c1 = new Computer("intel ", "ddr3 ", 4, "nvidia ", "ssd ",4, "TeslaPower ", 500, "cougat", "asus","bequiet");
      AComputer aComputerPlus = new RGB(c1);
      logger.successfull(150000);
      
      
      System.out.println(aComputerPlus.print());
   }
 
}