package Praktikum;

public class mobil extends kendaraan {
  private int jumlahPintu;

  public mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
    super(nama, kecepatanMaks, jenisMesin);
    this.jumlahPintu = jumlahPintu;
  }

  public void tampilkanInfoMobil() {
    System.out.println("Kecepatan Maks: " + kecepatanMaks + " km/h");
    System.out.println("Jumlah Pintu: " + jumlahPintu);
  }
}