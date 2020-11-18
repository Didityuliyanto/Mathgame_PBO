/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathGame;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Start {
    int pilih;
    String name;
    
    //menampilkan tampilan awal game (judul dan input nama pemain)
    void mulai(){
        System.out.println("**********************");
        System.out.println("Game Math");
        System.out.println("**********************");
        System.out.print("Masukkan Nama Anda: ");
        //proses inputan nama pemain
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
   
    //Menampilkan pilihan menu game
    void menu(){
        //membuat objek baru dari class penjumlahan dan pengurangan
        Penjumlahan x = new Penjumlahan(name);
        Pengurangan y = new Pengurangan(name);
        while(true){
            System.out.println("Pilih Menu: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Pilih No Menu: ");
            //Proses untuk pilih menu
            Scanner sp = new Scanner(System.in);
            pilih = sp.nextInt();
            if (pilih == 1){
                //memproses method dari Penjumlahan
                x.penjumlahan();
            }
            else if (pilih == 2){
                //memproses method dari Pengurangan
                y.pengurangan();
            }
            else if (pilih == 3){
               break;
            }
        }
    }
    
}
