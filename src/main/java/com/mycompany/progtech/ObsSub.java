package com.mycompany.progtech;

import java.awt.List;
import java.util.ArrayList;


/**
 *
 * @author Adam
 */
public class ObsSub implements IObserverable{
    private ArrayList<IObserver> observers;

    public ObsSub() {
        observers = new ArrayList<IObserver>();
    }
    
    @Override
    public void register(IObserver observer) {
        observers.add(observer);
        System.out.println("Observer feliratkozva");
    }
    
    @Override
    public void unregister(IObserver observer){
        observers.remove(observer);
        System.out.println("Egy observer leiratkozott");
    }

    @Override
    public void echoToAll(){
        for (IObserver o : observers){
            o.update();
        }
        System.out.println("Mind a(z) " + observers.size() + " feliratkozott értesítve lett.");
    }

  


}