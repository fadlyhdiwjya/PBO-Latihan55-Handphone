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
public class Handphone {
    
     String manufacture, operatingSystem, model;
    int harga;
    
    Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufacture  :  "+manufacture);
        System.out.println("os  :  "+operatingSystem);
        System.out.println("Model  :  "+model);
        System.out.println("Harga  :  "+harga);
    }
    
}
