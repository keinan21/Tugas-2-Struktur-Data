package antrian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Antrian antrian = new Antrian();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=================================");
            System.out.println("   MENU UTAMA PROGRAM ANTRIAN    ");
            System.out.println("=================================");
            System.out.println("1. Push Antrian (Enqueue)");
            System.out.println("2. Pop Antrian (Dequeue)");
            System.out.println("3. Cetak Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                scanner.next();
                continue;
            }

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka yang ingin dimasukkan ke antrian: ");
                    if (scanner.hasNextInt()) {
                        int nilai = scanner.nextInt();
                        antrian.push_antrian(nilai);
                    } else {
                        System.out.println("Input tidak valid! Harus memasukkan angka.");
                        scanner.next();
                    }
                    break;

                case 2:
                    System.out.println("Melakukan proses pop antrian...");
                    antrian.pop_antrian();
                    break;

                case 3:
                    antrian.cetak_antrian();
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    berjalan = false;
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia. Silakan pilih 1-4.");
                    break;
            }
        }

        scanner.close();
    }
}