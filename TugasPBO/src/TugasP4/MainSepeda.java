/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP4;

/**
 *
 * @author ThinkPad
 */
 
import java.util.Scanner;

public class MainSepeda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Sepeda sepeda = new Sepeda();
        
        System.out.print("Masukan Object Merk Sepeda: ");
        sepeda.merk = input.nextLine();
        
        System.out.println("Object " + sepeda.merk + " dibuat, jarak tmpuh awal " + sepeda.jarak + " km");
        
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    sepeda.bergerakMaju();
                    System.out.println("Bergerak Maju 10 Km");
                    System.out.println("Object Sepeda " + sepeda.merk + ", Jarak tempuh " + sepeda.jarak + " Km");
                    break;
                    
                case 2:
                    sepeda.bergerakMundur();
                    System.out.println("Bergerak Mundur 5 Km");
                    System.out.println("Object Sepeda " + sepeda.merk + ", Jarak tempuh " + sepeda.jarak + " Km");
                    break;
                    
                case 3:
                    sepeda.berhenti();
                    System.out.println("Sepeda Berhenti");
                    System.out.println("Object Sepeda " + sepeda.merk + ", Jarak tempuh akhir " + sepeda.jarak + " Km");
                    break;
                    
                case 0:
                    System.out.println("Keluar Program ..");
                    System.out.println("Terimakasih udah menggunakan program ini.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
        
        input.close();
    }
}





