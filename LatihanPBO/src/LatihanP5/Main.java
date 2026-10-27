/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP5;

/**
 *
 * @author ThinkPad
 */
public class Main {
    public static void main(String[] args){
        
        Mahasiswa m1 = new Mahasiswa();
        
        m1.npm = 123;
        m1.nama = "mega";
        m1.prodi = "Teknik Informatika";
        m1.setData(12345, "caca", "informatia");
        m1.infoMahasiswa();
        
        m1.infoMahasiswa();
        
        Mahasiswa m2 = new Mahasiswa();
        m2.infoMahasiswa();
        
        System.out.println(m1.penjumlahan(12));
        System.out.println(m1.penjumlahan(6, 7));
        
        
    }
}

// instance variabel = properti, atribute
// local variabel
// parameter variabel

class Mahasiswa{
    //instance variabel (hanya bisa di akses yang dibuat dari objek class tersebut  
    int npm;
    String nama;
    String prodi;
    
    public Mahasiswa(){
        this.npm = 0;
        this.nama = null;
        this.prodi = null;
    }
    
    public Mahasiswa(int npm){
        this.npm = npm;
        this.nama = null;
        this.prodi = null;
    }
    
    public Mahasiswa(int npm, String nama){
        this.npm = npm;  
        this.nama = nama;
        this.prodi = null;
    }
    
    double penjumlahan(double angka){
        return (angka + 5);
    }
    
    int penjumlahan(int angka){
        return (angka + 5);
    }
    
    int penjumlahan(int angka1, int angka2){
        return (angka1 + angka2);
    }
    
    public void setData(int npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public void infoMahasiswa(){
        int npm = 12345;
        int nilai = 75;
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Nilai : " + nilai);
        
    }
}