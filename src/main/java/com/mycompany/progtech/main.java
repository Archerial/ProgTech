package com.mycompany.progtech;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.lang.reflect.Constructor;
import java.util.logging.Level;
    
public class main {
    
   // The entry main() method
   public static void main(String[] args) 
   {   
      Logger logger = Logger.getInstance();
      AComputer c1 = new Computer("intel ", "ddr3 ", 4, "nvidia ", "ssd ",4, "TeslaPower ", 500, "cougar", "asus","bequiet",400000);
      //AComputer aComputerPlus = new RGB(c1);
      //logger.successfull(2300);
      
      /*
      ObsSub order = new ObsSub();
      
      Observer2 obs = new Observer2();
      
      order.register(obs);
      
      order.echoToAll();*/
      //if(obs.isBoolVar()){
          /*if (checkbox.rgb == true){
            order.register(obs);
          }else{
             order.unregister(obs);
          }
          if (checkbox.ssd == true){
              c1 = new ssd(c1);
          }*/
      //}
      
        MinositesGyar[] minosito = new MinositesGyar[2];
        minosito[0] = new MinositesGamer();
        minosito[1] = new MinositesOffice();
        for (MinositesGyar m : minosito) {
            Minosites minosites = m.Create();
            c1 = minosites.Minosit(c1);
        }
        
        
        

      
      
      
      
      
      System.out.println(c1.print());
   }
 
}