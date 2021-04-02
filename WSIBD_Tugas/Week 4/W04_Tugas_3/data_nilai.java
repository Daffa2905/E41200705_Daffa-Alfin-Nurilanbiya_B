/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W04_Tugas_3;
/**
 *
 * @author E41200705-DAFFA ALFIN NURILANBIYA-TIF B

 */
import java.util.Scanner;

public class data_nilai {

    public static void main(String[] args) {
        int banyak_data, nilai_data, avg, total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan banyak data nilai = ");
        banyak_data = scan.nextInt();

        int[] nilai = new int[banyak_data];

        for (int i = 0; i <= banyak_data - 1; i++) {
            System.out.print("Masukkan data nilai ke-" + (i + 1) + " = ");
            nilai_data = scan.nextInt();
            nilai[i] = nilai_data;
        }
        System.out.print("\n");

        int min = nilai[0];
        int max = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            } 
            else if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        
        for (int i = 0; i < nilai.length; i++) {
            total = total + nilai[i];
        }
        avg = total / nilai.length;
        
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Nilai rata-ratanya adalah = " + avg);
    }
}