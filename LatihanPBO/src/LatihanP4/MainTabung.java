/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP4;

/**
 *
 * @author ThinkPad
 */

import java.util.Scanner;

public class MainTabung {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
                
        Tabung T1 = new Tabung();
        System.out.print("Menghitung Tabung");
        
        System.out.print("Masukkan jari jari (r) : " );
        T1.r = input.nextDouble();
        
        System.out.print("Masukkan Tinggi (h) : " );
        T1.h = input.nextDouble();
        
        System.out.println("\nObject Tabung dibuat");
        System.out.println("Jari-jari Tabung : " + T1.r);
        System.out.println("Tinggi Tabung : " + T1.h);
        System.out.println("Phi Tabung : " + T1.phi);
        System.out.println("Volume Tabung : " + T1.hVolume());
    }
}

class Tabung{
    
    double r;
    double h;
    double volume;
    final double phi=3.14; //pakai konstanta 
    
    //method
    public double hVolume(){
        volume = phi * r * r * h;
        return volume;
    }
}








