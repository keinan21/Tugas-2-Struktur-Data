package antrian;

public class Antrian {
    protected Node head;
    protected Node tail;
    protected int size;

    public Antrian(){
        head = null;
        tail = null;
        size = 0;
    }

    public void push_antrian(int baru){

        if(size <= 0){
            tail = new Node(baru, null);
            head =  tail;
        } else {
            Node temp =  new Node(baru, null);
            tail.setPtr(temp);
            tail = temp;
        }
        System.out.println("berhasil memasukan " + baru +" ke antrian");
        size++;
    }

    public void pop_antrian(){
        Object temp;
        if(size < 1){
            System.out.println("Tidak ada yang bisa di pop");
            return;
        } else {
            temp = head.getData();
            head = head.getPtr();
            size--;
        }
        if(size == 0){
            tail = null;
        }
        System.out.println("berhasil mengeluarkan " + temp +" ke antrian");

    }

    public void cetak_antrian(){
        Node temp = head;
        System.out.println("ini kondisi antrian sekarang");
        for (int i = 0; i < size; i++){
            System.out.print("|");
            System.out.print(" " + temp.getData() + " ");
            System.out.print("| -> ");
            temp = temp.getPtr();
        }
        System.out.print(" NULL");
    }

}
