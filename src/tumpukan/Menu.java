package tumpukan;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tumpukan tumpukan = new Tumpukan();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=================================");
            System.out.println("   MENU UTAMA PROGRAM TUMPUKAN   ");
            System.out.println("=================================");
            System.out.println("1. Push (Tambah Data)");
            System.out.println("2. Pop (Hapus Data Teratas)");
            System.out.println("3. Get Top (Lihat Data Teratas)");
            System.out.println("4. Cetak Tumpukan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                scanner.next(); // Membersihkan input yang salah
                continue;
            }

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka (integer) yang ingin di-push: ");
                    if (scanner.hasNextInt()) {
                        int nilai = scanner.nextInt();
                        tumpukan.push(nilai);
                    } else {
                        System.out.println("Input tidak valid! Harus memasukkan angka.");
                        scanner.next();
                    }
                    break;

                case 2:
                    System.out.print("Pilih tumpukan yang mau di-pop (ganjil/genap): ");
                    String jenisPop = scanner.next();
                    tumpukan.pop(jenisPop);
                    break;

                case 3:
                    System.out.print("Pilih tumpukan yang mau dilihat top-nya (ganjil/genap): ");
                    String jenisTop = scanner.next();
                    tumpukan.get_top(jenisTop);
                    break;

                case 4:
                    System.out.print("Pilih tumpukan yang mau dicetak (ganjil/genap): ");
                    String jenisCetak = scanner.next();
                    tumpukan.cetak_tumpukan(jenisCetak);
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    berjalan = false;
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia. Silakan pilih 1-5.");
                    break;
            }
        }

        scanner.close();
    }
}