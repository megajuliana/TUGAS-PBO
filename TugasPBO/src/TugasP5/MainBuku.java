/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP5;

/**
 *
 * @author ThinkPad
 */
public class MainBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku();
        b1.infoBuku();

        Buku b2 = new Buku("Pemrograman Java");
        b2.infoBuku();

        Buku b3 = new Buku("Struktur Data", "Budi Raharjo");
        b3.infoBuku();

        Buku b4 = new Buku("Algoritma Pemrograman", "Siti Aminah", 2023);
        b4.infoBuku();
    }
}

class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    public Buku() {
        this.judul = "Belum Diisi";
        this.pengarang = "Belum Diisi";
        this.tahunTerbit = 0;
    }

    public Buku(String judul) {
        this.judul = judul;
        this.pengarang = "Belum Diisi";
        this.tahunTerbit = 0;
    }

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = 0;
    }

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void infoBuku() {
        System.out.println("\nINFORMASI BUKU");
        System.out.println("Judul        : " + this.judul);
        System.out.println("Pengarang    : " + this.pengarang);
        System.out.println("Tahun Terbit : " + (this.tahunTerbit == 0 ? "-" : this.tahunTerbit));
    }
}
