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
public class Android extends Handphone {
    
       private String keyStore;
       
       public Android(String man, String os, String model , int harga){
           super(man,os,model,harga);
       }
        
       
       public void setKeyStrore(String  keyStore){
           this.keyStore = keyStore;
       }
       
       public String getKeyStore(){
           return keyStore;
       }
        
        
       
    
}
