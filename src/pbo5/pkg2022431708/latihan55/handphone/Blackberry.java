/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan55.handphone;

/**
 *
 * @author HP
 */
public class Blackberry extends Handphone {
        
    
    private String pinBB;
    
    public Blackberry(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public void setPinBb(String pinBB){
        this.pinBB = pinBB;
    }
    
    public String getPinBb(){
        return pinBB;
    }
}
