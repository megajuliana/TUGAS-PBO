/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP6pewarisan;

/**
 *
 * @author ThinkPad
 */
public class Employee {
    int nip;
    String nama;
    double gaji;
    
    // contructor
    public Employee(int nip, String nama, double gaji){
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }
    
    //overload
    public Employee(int nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
   
    
    public void info() {
        System.out.println("\nINPO EMPLOYEE");
        System.out.println("NIP  :" + this.nip);
        System.out.println("NAMA :" + this.nama);
        System.out.println("GAJI :" + this.gaji);
    }
            
}
