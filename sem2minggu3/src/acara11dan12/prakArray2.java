/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara11dan12;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author user
 */
public class prakArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random bilangan = new Random();
        
        System.out.print("input panjang array :");
        int panjang = input.nextInt();
        if(panjang >0){
        int[] deret = new int[panjang];
        for(int i = 0;i<deret.length;i++){
            deret[i] = bilangan.nextInt(100)+1;
        }
        for(int a : deret){
            System.out.print(a+" ");
        }
        System.out.println("elemen array berahsil di buat");
    }else{
            System.out.println("inputan tidak boleh 0");
    }
    }
}
