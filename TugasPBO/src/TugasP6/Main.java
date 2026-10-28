/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP6;

/**
 *
 * @author ThinkPad
 */
public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);  
        p.hitungSisi();
        p.info();
        
        Lingkaran l = new Lingkaran(7);
        l.hitungLuas();
        l.info();
        
        PersegiPanjang pp = new PersegiPanjang(8, 4);
        pp.hitungPersegiPanjang();
        pp.info();
        
        Segitiga s = new Segitiga(6, 8);
        s.hitungSegitiga();
        s.info();
    }
}

