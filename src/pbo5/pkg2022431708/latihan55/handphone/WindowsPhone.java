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
public class WindowsPhone extends Handphone {
    private String wpkeyStore;
    
    
    public WindowsPhone(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }
    
    public void setWpKeyStore(String wpKeystore){
        this.wpkeyStore = wpKeystore;
    }
    
    public String getWpKeyStore(){
        return wpkeyStore;
    }
    
    
    
    
}
