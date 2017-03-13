/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.HashMap;

/**
 *
 * @author giuseppe
 */
public class manager {
    HashMap<String,runnTest> aaa=new HashMap<String,runnTest>();

    public manager() {
    }
    
    public void createThread(String re){
        runnTest r=new runnTest(re);
        r.run();
        this.aaa.put(re, r);
    }
}
