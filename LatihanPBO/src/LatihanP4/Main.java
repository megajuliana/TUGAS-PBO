/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP4;

/**
 *
 * @author ThinkPad
 */
public class Main {
    public static void main(String[] args) {
     
        //object : nama_kelas namaObject=new constructor(); .. constructor di java itu namaContructorWajib=namaclass dan ini fungsinya memberikan nilai awal=0.0
        Lingkaran L1 = new Lingkaran();
        System.out.print("Object LingkaranSatu dibuat");
        System.out.print("\nJari LingkaranSatu : " + L1.jari);
        System.out.print("\nPhi LingkaranSatu : " + L1.phi);
        System.out.print("\nLuas LingkaranSatu : " + L1.luas);
        
        Lingkaran L2 = new Lingkaran();
        L2.jari = 7;
        System.out.print("\n\nObject LingkaranDua dibuat");
        System.out.print("\nJari LingkaranDua : " + L2.jari);
        System.out.print("\nPhi LingkaranDua : " + L2.phi);
        System.out.print("\nLuas LingkaranDua : " + L2.hLuas());
    }
}

class Lingkaran{
    
    // property adalah atribut yang di miliki clas misal "jari", jangan di sebutin niali awalnya karena bersifat global, nilai tergantung object pemanggilnya 
    double jari;
    double luas;
    final double phi=3.14; //pakai konstanta 
    
    //method
    public double hLuas(){
        luas = phi * jari *jari;
        return luas;
    }
}

