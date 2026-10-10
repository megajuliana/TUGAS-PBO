/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizP3;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class QuizJava {

    // Method hitung Nilai Akhir 
    public static double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (0.30 * tugas) + (0.30 * uts) + (0.40 * uas);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.println("==================================================");
        System.out.println("          SISTEM PENGOLAHAN NILAI MAHASISWA       ");
        System.out.println("==================================================");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        
        // membersihkan buffer
        input.nextLine(); 

        // Deklarasi array sesuai jumlah mahasiswa
        String[] npm = new String[jumlah];
        String[] nama = new String[jumlah];
        double[] nilaiTugas = new double[jumlah];
        double[] nilaiUts = new double[jumlah];
        double[] nilaiUas = new double[jumlah];
        double[] nilaiAkhir = new double[jumlah];
        char[] nilaiHuruf = new char[jumlah];
        String[] status = new String[jumlah];

        // Looping input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa Ke-" + (i + 1));
            System.out.println("--------------------------------------------------");
            System.out.print("NPM         : ");
            npm[i] = input.nextLine();
            System.out.print("Nama        : ");
            nama[i] = input.nextLine();

            // Validasi Tugas
            do {
                System.out.print("Nilai Tugas : ");
                nilaiTugas[i] = input.nextDouble();
                if (nilaiTugas[i] < 0 || nilaiTugas[i] > 100) {
                    System.out.println("[!] Nilai tidak valid! Masukkan angka antara 0 - 100.");
                }
            } while (nilaiTugas[i] < 0 || nilaiTugas[i] > 100);

            // Validasi UTS 
            do {
                System.out.print("Nilai UTS   : ");
                nilaiUts[i] = input.nextDouble();
                if (nilaiUts[i] < 0 || nilaiUts[i] > 100) {
                    System.out.println("[!] Nilai tidak valid! Masukkan angka antara 0 - 100.");
                }
            } while (nilaiUts[i] < 0 || nilaiUts[i] > 100);

            // Validasi UAS 
            do {
                System.out.print("Nilai UAS   : ");
                nilaiUas[i] = input.nextDouble();
                if (nilaiUas[i] < 0 || nilaiUas[i] > 100) {
                    System.out.println("[!] Nilai tidak valid! Masukkan angka antara 0 - 100.");
                }
            } while (nilaiUas[i] < 0 || nilaiUas[i] > 100);

            // membersihkan buffer setelah nextDouble
            input.nextLine(); 

            // Hitung Nilai Akhir panggil method hitungNilaiAkhir
            nilaiAkhir[i] = hitungNilaiAkhir(nilaiTugas[i], nilaiUts[i], nilaiUas[i]);

            // Menentukan Nilai Huruf dan Status dengan Percabangan
            if (nilaiAkhir[i] >= 80) {
                nilaiHuruf[i] = 'A';
                status[i] = "LULUS";
            } else if (nilaiAkhir[i] >= 70) {
                nilaiHuruf[i] = 'B';
                status[i] = "LULUS";
            } else if (nilaiAkhir[i] >= 60) {
                nilaiHuruf[i] = 'C';
                status[i] = "LULUS";
            } else if (nilaiAkhir[i] >= 50) {
                nilaiHuruf[i] = 'D';
                status[i] = "TIDAK LULUS";
            } else {
                nilaiHuruf[i] = 'E';
                status[i] = "TIDAK LULUS";
            }
        }

        // Output Tabel Daftar Nilai Mahasiswa
        System.out.println("\n==========================================================================");
        System.out.println("                         DAFTAR NILAI MAHASISWA                           ");
        System.out.println("==========================================================================");
        System.out.printf("%-4s %-12s %-12s %-6s %-6s %-6s %-8s %-6s %-12s\n", 
                "No", "NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf", "Status");
        System.out.println("--------------------------------------------------------------------------");

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double totalNilaiAkhir = 0;
        double nilaiTertinggi = nilaiAkhir[0];
        double nilaiTerendah = nilaiAkhir[0];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-4d %-12s %-12s %-6.0f %-6.0f %-6.0f %-8.1f %-6c %-12s\n",
                    (i + 1), npm[i], nama[i], nilaiTugas[i], nilaiUts[i], nilaiUas[i], 
                    nilaiAkhir[i], nilaiHuruf[i], status[i]);

            // Akumulasi statistik
            totalNilaiAkhir += nilaiAkhir[i];

            if (status[i].equals("LULUS")) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }

            if (nilaiAkhir[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] < nilaiTerendah) {
                nilaiTerendah = nilaiAkhir[i];
            }
        }

        double rataRataKelas = totalNilaiAkhir / jumlah;

        System.out.println("==========================================================================");
        System.out.println("\nSTATISTIK NILAI");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Jumlah Mahasiswa      : " + jumlah);
        System.out.println("Jumlah Mahasiswa Lulus : " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus    : " + jumlahTidakLulus);
        System.out.printf("Nilai Tertinggi       : %.1f\n", nilaiTertinggi);
        System.out.printf("Nilai Terendah        : %.1f\n", nilaiTerendah);
        System.out.printf("Rata-rata Kelas       : %.2f\n", rataRataKelas);
        System.out.println("==========================================================================");
    }
}