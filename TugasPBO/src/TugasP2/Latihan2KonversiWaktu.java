package TugasP2;

import java.util.Scanner;

public class Latihan2KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jam, menit, detik, totdet;

        System.out.print("Masukkan jam: ");
        jam = input.nextInt();
        
        System.out.print("Masukkan menit: ");
        menit = input.nextInt();
        
        System.out.print("Masukkan detik: ");
        detik = input.nextInt();

        totdet = (jam * 3600) + (menit * 60) + detik;

        System.out.println("Total detik = " + totdet);
    }
}