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
public class PBO52022431708Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    
    /**
 *
 * @author
 * Nama : Fadly Hadi Wijaya
 * Nim : 2022431708
 * Kelas : PBO - FS112B
 * Deskripsi Program : Program ini berisi Program untuk Menampilkan Nama Handphone 
 *
 */
    
   
    public static void main(String[] args) {
        
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStrore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        System.out.println();
        
        
        Blackberry bb = new Blackberry("BlackB", "RIM","Curve", 2000000);
        bb.setPinBb("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBb());
        System.out.println();
        
        
       WindowsPhone windows = new WindowsPhone("Nokia", "Win8","Lumia",1000000);
       windows.setWpKeyStore("UUUQIJWORJ");
       windows.displayProduct();
       System.out.println("Wp Key Store : "+windows.getWpKeyStore());
       System.out.println();

        // TODO code application logic here
    }
    
}
