/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W06_Tugas;

import java.util.Scanner;

/**
 *
 * @author DAFFA ALFIN NURILANBIYA
 */

public class BinarySearch {
   public static void binarySearch(int arr[], int key){  
       int first = 0;
       int last = arr.length-1;
       int middle = (first + last)/2;  
        while( first <= last ){  
           if ( arr[middle] < key ){  
                first = middle + 1;     
           } if ( arr[middle] == key ){  
                System.out.println("Elemen ditemukan di index: " + middle);  
                break;  
           } else {  
                last = middle - 1;  
           }  
           middle = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println("Element tidak ditemukan!");  
        }  
    }  
    public static void main(String args[]){  
           int arr[] = {20,40,60,80,100};
           Scanner input = new Scanner(System.in);
           System.out.print("Masukkan value: ");
           int key = input.nextInt();
           binarySearch(arr,key);     
    }  
}  