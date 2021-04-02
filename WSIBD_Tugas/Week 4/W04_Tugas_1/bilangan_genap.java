/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W04_Tugas_1;

/**
 *
 * @author E41200705-DAFFA ALFIN NURILANBIYA-TIF B
 */
import java.util.Scanner;

public class bilangan_genap {

    public static void main(String[] args) {
        
    int bil_awal; 
    int bil_akhir;
    
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan batas bilangan awal : ");
    bil_awal = scan.nextInt();
    System.out.print("Masukkan batas bilangan akhir : ");
    bil_akhir = scan.nextInt();
    System.out.print("\n");

    if (bil_awal > bil_akhir) {
    System.out.print("Batas bilangan awal tidak lebih dari batas bilangan akhir !");
    } 
    
    else if (bil_awal % 2 == 1 & bil_awal == bil_akhir) {
    System.out.print("Tidak ada bilangan genap");
    } 
    
    else {
    for (int i = bil_awal; bil_awal <= bil_akhir; bil_awal++) {
    if (bil_awal % 2 == 0) {
                    System.out.print(bil_awal + " ");
                }
            }
        }
        System.out.println("\n");
    }
}

