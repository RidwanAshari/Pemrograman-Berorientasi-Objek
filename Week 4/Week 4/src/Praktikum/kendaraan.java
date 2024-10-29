package Praktikum;

public class kendaraan {
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;
  
    public kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
      this.nama = nama;
      this.kecepatanMaks = kecepatanMaks;
      this.jenisMesin = jenisMesin;
    }
  
    public void tampilkanInfoKendaraan() {
      System.out.println("Nama: " + nama);
      System.out.println("Kecepatan Maks: " + kecepatanMaks);
      System.out.println("Jenis Mesin: " + jenisMesin);
    }
  }
