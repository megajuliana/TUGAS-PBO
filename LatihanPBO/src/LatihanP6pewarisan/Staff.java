/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP6pewarisan;

/**
 *
 * @author ThinkPad
 */
public class Staff extends Employee { //pake extends dari employee
    String bagian;
    
    // contructor
    public Staff(int nip, String nama, double gaji){
        super(nip, nama, gaji);
    }
    
    //overload
    public Staff(int nip, String nama){
        super(nip, nama);
    }
    
    public void info(){
        System.out.println("\nInfo Staff");
        System.out.println("NIP  :" + super.nip);
        System.out.println("NAMA :" + super.nama);
        System.out.println("GAJI :" + super.gaji);
    }
    
    public void infoBagian(){
        System.out.println("Bagian " + 
                bagian);
    }

    
}
