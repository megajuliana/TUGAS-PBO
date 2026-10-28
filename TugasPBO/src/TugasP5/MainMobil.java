/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP5;

/**
 *
 * @author ThinkPad
 */
public class MainMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza");

        Mobil mobil2 = new Mobil("Honda", "Civic", 2022);

        System.out.println("INFORMASI MOBIL 1");
        mobil1.infoMobil();

        System.out.println("\nINFORMASI MOBIL 2");
        mobil2.infoMobil();
    }
}

class Mobil {
    String merek;
    String model;
    int tahun;

    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
        this.tahun = 2025; 
    }

    public Mobil(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    public void infoMobil() {
        System.out.println("Merek : " + this.merek);
        System.out.println("Model : " + this.model);
        System.out.println("Tahun : " + this.tahun);
    }
}
