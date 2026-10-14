/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */ 
public class Sepeda {
     // Property / Atribut
    String merk;
    int jarak = 0; // Jarak awal sebelum digunakan adalah 0 km
    
    // Method untuk bergerak maju (menambah jarak 10 km)
    public void bergerakMaju() {
        jarak += 10;
    }
    
    // Method untuk bergerak mundur (mengurangi jarak 5 km)
    public void bergerakMundur() {
        jarak -= 5;
    }
    
    // Method untuk berhenti (menampilkan status/posisi terakhir)
    public void berhenti() {
        // Method berhenti menandai sepeda tidak lagi bergerak
    }
}
