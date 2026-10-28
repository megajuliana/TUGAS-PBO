/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP5;

/**
 *
 * @author ThinkPad
 */
public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(7.0);
        System.out.println("OBJEK LINGKARAN 1 (Input 7.0)");
        l1.infoLingkaran();

        Lingkaran l2 = new Lingkaran(0);
        System.out.println("\nOBJEK LINGKARAN 2 (Input 0)");
        l2.infoLingkaran();

        Lingkaran l3 = new Lingkaran(-5.5);
        System.out.println("\nOBJEK LINGKARAN 3 (Input -5.5)");
        l3.infoLingkaran();
    }
}

class Lingkaran {
    double jariJari;
    final double PI = 3.14;

    public Lingkaran(double jariJari) {
        if (jariJari <= 0) {
            this.jariJari = 1.0; 
        } else {
            this.jariJari = jariJari;
        }
    }

    public double hitungLuas() {
        return PI * jariJari * jariJari;
    }

    public void infoLingkaran() {
        System.out.println("Jari-jari : " + this.jariJari);
        System.out.println("Luas      : " + hitungLuas());
    }
}
