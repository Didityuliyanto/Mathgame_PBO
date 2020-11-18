/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathGame;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ASUS
 */
public class Pengurangan {
    int bil1;
    int bil2; 
    int hasil; 
    int jawab; 
    int skor; 
    int lives;
    int level;
    String name;
    
    //constructor untuk memanggil nama pemain yang tersimpan di class Star
    public Pengurangan(String name){
        this.name = name;
    }
     
    void pengurangan(){
        //status
        lives = 3;
        skor = 0;
        level = 1;
        
        System.out.println("**********************");
        System.out.println("Game Math - Penjumlahan");
        System.out.println("**********************");
        Scanner p = new Scanner(System.in);
        
        //method untuk melakukan proses penjumlahan
        while(true){
            if (level == 1) {
                bil1 = ThreadLocalRandom.current().nextInt(1, 10);
                bil2 = ThreadLocalRandom.current().nextInt(1, 10);
                hasil = bil1 - bil2;
                System.out.println("Berapakah hasil dari " + bil1 +" - " + bil2 + " ?");
                System.out.print("Jawab = ");
                jawab = p.nextInt();
                if(hasil == jawab){
                    skor += 5;
                    System.out.println("Selamat " + name +", Anda benar [Skor: " + skor+ "] [Lives: " + lives + "][Level: " + level + "]");
                } else {
                    skor -= 2;
                    lives -= 1;
                    System.out.println("Wah, salah deh [Skor: " + skor+ "] [Lives: " + lives + "][Level: " + level + "]");
                }
                if (skor >= 100){
                    level += 1;
                }
                if (lives == 0){
                    System.out.println("Hai " + name + ", Jangan menyerah ya untuk mencoba lagi.");
                    break;
                }
            }
            else if (level == 2){
                bil1 = ThreadLocalRandom.current().nextInt(-10, -1);
                bil2 = ThreadLocalRandom.current().nextInt(-10, -1);
                hasil = bil1 - bil2;
                System.out.println("Berapakah hasil dari (" + bil1 + ") - (" + bil2 + ") ?");
                System.out.print("Jawab = ");
                jawab = p.nextInt();
                if(hasil == jawab){
                    skor += 5;
                    System.out.println("Selamat " + name + ", Anda benar [Skor: " + skor+ "] [Lives: " + lives + "][Level: " + level + "]");
                } else {
                    skor -= 2;
                    lives -= 1;
                    System.out.println("Wah, salah deh [Skor: " + skor + "] [Lives: " + lives + "][Level: " + level + "]");
                }
                if (skor >= 200){
                    level += 1;
                }
                if (lives == 0){
                    System.out.println("Hai " + name + ", Jangan menyerah ya untuk mencoba lagi.");
                    break;
                }
            }
            else {
                bil1 = ThreadLocalRandom.current().nextInt(-10, 10);
                bil2 = ThreadLocalRandom.current().nextInt(-10, 10);
                hasil = bil1 - bil2;
                if (bil1 < 0 && bil2 < 0){
                    System.out.println("Berapakah hasil dari (" + bil1 + ") - (" + bil2 + ") ?");
                } else if (bil1 < 0 && bil2 > 0){
                    System.out.println("Berapakah hasil dari (" + bil1 + ") - " + bil2 + " ?");
                } else if (bil1 > 0 && bil2 < 0){
                    System.out.println("Berapakah hasil dari " + bil1 + " - (" + bil2 + ") ?");
                } else {
                    System.out.println("Berapakah hasil dari " + bil1 + " - " + (bil2) + " ?");
                }
                System.out.print("Jawab = ");
                jawab = p.nextInt();
                if(hasil == jawab){
                    skor += 5;
                    System.out.println("Selamat " + name + ", Anda benar [Skor: " + skor + "] [Lives: " + lives + "][Level: " + level + "]");
                } else {
                    skor -= 2;
                    lives -= 1;
                    System.out.println("Wah, salah deh [Skor: " + skor + "] [Lives: " + lives + "][Level: " + level + "]");
                }
                if (skor >= 300){
                    System.out.println("Selamat " + name + ", Anda telah menyelesaikan soal pengurangan dengan baik. Silakan dicoba soal pemjumlahan ya");
                    break;
                }
                if (lives == 0){
                    System.out.println("Hai " + name + ", Jangan menyerah ya untuk mencoba lagi.");
                    break;
                }
            }
        }
    }   
}
