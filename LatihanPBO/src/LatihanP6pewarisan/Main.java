/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanP6pewarisan;

/**
 *
 * @author ThinkPad
 */
public class Main {
    public static void main(String[] args) {
//        Employee e = new Employee();
//        e.nip = 123;
//        e.nama = "mega";
//        e.gaji = 2000000;
//        e.x = 5;

        // contructor
        Employee e = new Employee(123, "mega", 2000000); 
        e. info();
        
        Staff s = new Staff(456, "putri", 1500000);
//        s.nip = 456;
//        s.nama = "putri";
//        s.gaji = 1500000;
        s.bagian = "Keuangan";
        s.info();
        s.infoBagian(); 
        
    }
}
