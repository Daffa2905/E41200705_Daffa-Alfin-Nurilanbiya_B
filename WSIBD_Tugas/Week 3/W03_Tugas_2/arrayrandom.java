/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W03_Tugas_2;

/**
 *
 * @author Villkiss
 */
import java.util.Scanner;
import java.util.Random;

public class arrayrandom {

    public static void main(String[] args) {
        int jumlah = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukkan array random : ");
        jumlah = scan.nextInt();

        for (int i = 0; i <= jumlah - 1; i++) {
            int[] rndm = new int[jumlah];
            rndm[i] = random.nextInt(10);
            System.out.print(rndm[i] + " ");
        }
        System.out.println("");
    }
}