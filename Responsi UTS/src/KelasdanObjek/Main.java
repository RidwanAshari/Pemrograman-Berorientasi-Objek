package KelasdanObjek;

public class Main {
    public static void main(String[] args) {
        // Polimorfisme Produk
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");

        produk1.tampilkanInfo();
        System.out.println(); // Pemisah output
        produk2.tampilkanInfo();
        
        System.out.println();

        // Polimorfisme Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Ridwan", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Fadzil", 3000000, 12);

        pegawai1.tampilkanInfo();
        System.out.println(); // Pemisah output
        pegawai2.tampilkanInfo();
    }
}

