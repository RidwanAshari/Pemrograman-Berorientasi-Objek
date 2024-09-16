/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iwan;

/**
 *
 * @author mridw
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan ();
        kucing.nama = "Eza";
        kucing.umur = 2;
        kucing.suara();
        
        Mobil mobil1 = new Mobil ("Honda", "Civic", 2023);
        Mobil mobil2 = new Mobil("Daihatsu", "Xenia", 2005);

        mobil1.displayInfo();
        mobil1.startEngine();
        mobil2.displayInfo();
        mobil2.startEngine();
        mobil1.setWarna("Putih");
        mobil2.setWarna("Biru");
        System.out.println("\nSetelah mengubah warna:");
        mobil1.displayInfo();
        mobil2.displayInfo();
        
    }
}
