package tumpukan;
public class Tumpukan {
    protected Node topGanjil;
    protected Node topGenap;
    protected int jumlahGanjil;
    protected int jumlahGenap;

    public void push(Integer value){

        if(value % 2 == 0){
            topGenap = new Node(value, topGenap);
            jumlahGenap++;
            System.out.println("berhasil menambahkan " + value + " dalam tumpukan genap");
            System.out.println(" ");
        } else {
            topGanjil = new Node(value, topGanjil);
            jumlahGanjil++;
            System.out.println("berhasil menambahkan " + value + " dalam tumpukan ganjil");
            System.out.println(" ");
        }


    }

    public void pop(String jenis){

        if(jenis.equals("ganjil")){
            if (jumlahGanjil <= 0){
                System.out.println("Tidak bisa melakukan operasi pop karena jumlah element kurang dari 1");
                System.out.println(" ");
            } else {
                Object temp = topGanjil.getData();
                topGanjil = topGanjil.getPtr();
                jumlahGanjil--;
                System.out.println("Berhasil Mengeluarkan " + temp + " dari tumpukan ganjil");
                System.out.println(" ");
            }
        } else if (jenis.equals("genap")) {
            if (jumlahGenap <= 0){
                System.out.println("Tidak bisa melakukan operasi pop karena jumlah element kurang dari 1");
                System.out.println(" ");
            } else {
                Object temp = topGenap.getData();
                topGenap = topGenap.getPtr();
                jumlahGenap--;
                System.out.println("Berhasil Mengeluarkan " + temp + " dari tumpukan genap");
                System.out.println(" ");
            }
        } else {
            System.out.println("input tidak valid");
            System.out.println(" ");
        }
    }

    public void get_top(String jenis){
        if (jenis.equals("ganjil")){
            if (jumlahGanjil <= 0){
                System.out.println("Tumpukan ganjil kosong");
                System.out.println(" ");
            } else {
                System.out.println("Data paling atas dari tumpukan ganjil adalah " + topGanjil.getData());
                System.out.println(" ");
            }
        } else if (jenis.equals("genap")) {
            if (jumlahGenap <= 0){
                System.out.println("Tumpukan genap kosong");
                System.out.println(" ");
            } else {
                System.out.println("Data paling atas dari tumpukan genap adalah " +  topGenap.getData());
                System.out.println(" ");
            }
        } else {
            System.out.println("input tidak valid");
        }
    }

    public void cetak_tumpukan(String jenis){
        if (jenis.equals("ganjil")){
            if (jumlahGanjil <= 0){
                System.out.println("Tumpukan ganjil kosong");
            } else {
                Node temp = topGanjil;
                System.out.println("berikut adalah nilai tumpukan ganjil dari atas");
                for(int i = 0; i < jumlahGanjil; i++){
                    System.out.println("|   " + temp.getData() + "   |");
                    temp = temp.getPtr();
                }
                System.out.println("----------");
            }
        } else if (jenis.equals("genap")){
            if (jumlahGenap <= 0){
                System.out.println("Tumpukan genap kosong");
            } else {
                Node temp = topGenap;
                System.out.println("berikut adalah nilai tumpukan genap dari atas");
                for(int i = 0; i < jumlahGenap; i++){
                    System.out.println("|   " +temp.getData()+ "   |");
                    temp = temp.getPtr();
                }
                System.out.println("----------");
            }
        } else {
            System.out.println("input tidak valid");
            System.out.println(" ");
        }
    }
}
