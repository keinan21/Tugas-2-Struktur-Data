package antrian;

public class Testing {
    public static void main(String[] args) {
        Antrian tes = new Antrian();

        System.out.println("=== 1. TES POP PADA ANTRIAN KOSONG ===");
        tes.pop_antrian();
        System.out.println();

        System.out.println("=== 2. TES PUSH BEBERAPA ELEMEN (10, 20, 30) ===");
        tes.push_antrian(10);
        tes.push_antrian(20);
        tes.push_antrian(30);
        System.out.print("Isi antrian: ");
        tes.cetak_antrian();
        System.out.println("\n");

        System.out.println("=== 3. TES POP SATU ELEMEN (FIFO: 10 HARUS KELUAR) ===");
        tes.pop_antrian();
        System.out.print("Isi antrian setelah pop: ");
        tes.cetak_antrian();
        System.out.println("\n");

        System.out.println("=== 4. TES PUSH DATA BARU (40) ===");
        tes.push_antrian(40);
        System.out.print("Isi antrian saat ini: ");
        tes.cetak_antrian();
        System.out.println("\n");

        System.out.println("=== 5. TES DRAINING (MENGOSONGKAN SELURUH ANTRIAN) ===");
        tes.pop_antrian(); // Hapus 20
        tes.pop_antrian(); // Hapus 30
        tes.pop_antrian(); // Hapus 40
        System.out.print("Isi antrian setelah dikuras: ");
        tes.cetak_antrian();
        System.out.println();

        System.out.println("Mencoba pop sekali lagi saat sudah kosong:");
        tes.pop_antrian();
    }
}