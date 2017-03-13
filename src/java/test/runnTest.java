/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giuseppe
 */
public class runnTest implements Runnable{
String name="";

    public runnTest(String name) {
        this.name=name;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("I'm runnTest named:"+this.name);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(runnTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
