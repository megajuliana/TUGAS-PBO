/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author ThinkPad
 */
public class Persegi extends BangunDatar {
    int sisi;
    
    // Constructor
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    
    public void hitungSisi() {
        this.luas = sisi * sisi;
        this.keliling = 4 * sisi;
    }
    
    public void info() {
        System.out.println("\nINFO PERSEGI");
        System.out.println("Sisi     : " + this.sisi);
        System.out.println("LUAS     : " + super.luas);
        System.out.println("KELILING : " + super.keliling);
    }
}
