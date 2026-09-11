//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package tumpukan;

public class Main {
    public static void main(String[] args) {
        Tumpukan tumpukan = new Tumpukan();

        System.out.println("=== 1. TES TUMPUKAN KOSONG (EDGE CASE) ===");
        tumpukan.get_top("ganjil");
        tumpukan.get_top("genap");
        tumpukan.pop("ganjil");
        tumpukan.pop("genap");
        tumpukan.cetak_tumpukan("ganjil");
        tumpukan.cetak_tumpukan("genap");
        System.out.println();

        System.out.println("=== 2. TES PUSH BANYAK DATA (ACAK, NOL, NEGATIF) ===");
        // Menguji angka genap, ganjil, nol, dan angka negatif
        tumpukan.push(12);
        tumpukan.push(7);
        tumpukan.push(0);
        tumpukan.push(-5);
        tumpukan.push(88);
        tumpukan.push(99);
        tumpukan.push(-4);
        System.out.println();

        System.out.println("=== 3. TES CETAK AWAL DARI ATAS (LIFO) ===");
        tumpukan.cetak_tumpukan("ganjil");
        System.out.println();
        tumpukan.cetak_tumpukan("genap");
        System.out.println();

        System.out.println("=== 4. TES GET TOP DUA TUMPUKAN ===");
        tumpukan.get_top("ganjil");
        tumpukan.get_top("genap");
        System.out.println();

        System.out.println("=== 5. TES POP BERUNTUTAN (DRAIN TEST GANJIL) ===");
        // Mengosongkan tumpukan ganjil satu per satu
        tumpukan.pop("ganjil");
        tumpukan.pop("ganjil");
        tumpukan.get_top("ganjil");
        tumpukan.pop("ganjil"); // Pop ekstra untuk memicu kondisi kosong
        tumpukan.cetak_tumpukan("ganjil");
        System.out.println();

        System.out.println("=== 6. VERIFIKASI ISOLASI TUMPUKAN GENAP ===");
        // Memastikan tumpukan genap tidak terpengaruh oleh pop ganjil
        System.out.println("Memastikan tumpukan genap tetap utuh:");
        tumpukan.cetak_tumpukan("genap");
        System.out.println();

        System.out.println("=== 7. TES POP PARSIAL PADA GENAP ===");
        tumpukan.pop("genap");
        tumpukan.cetak_tumpukan("genap");
        System.out.println();

        System.out.println("=== 8. TES VALIDASI INPUT & CASE SENSITIVITY ===");
        tumpukan.get_top("Ganjil");     // Kapital
        tumpukan.pop("GENAP");          // Upper-case
        tumpukan.cetak_tumpukan("abc");  // String acak
    }
}
