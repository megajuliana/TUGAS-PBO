/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author ThinkPad
 */
public class Segitiga extends BangunDatar {
    double alas;
    double tinggi;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void hitungSegitiga() {
        double miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        this.luas = (int) (0.5 * alas * tinggi);
        this.keliling = (int) (alas + tinggi + miring);
    }
    
    public void info() {
        System.out.println("\nINFO SEGITIGA");
        System.out.println("Alas     : " + this.alas);
        System.out.println("Tinggi   : " + this.tinggi);
        System.out.println("LUAS     : " + super.luas);
        System.out.println("KELILING : " + super.keliling);
    }
}
