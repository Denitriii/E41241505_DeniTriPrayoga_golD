/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara9dan10;
import java.util.Scanner;

public class segitigaTerbalik {
    public static void main(String[] args) {
        Scanner inputS = new Scanner(System.in);
        int sisi;
        
        System.out.print("input sisi segitiga : ");
        sisi = inputS.nextInt();
        
        for(int i = 0 ; i<sisi;i++){
            for(int j =0 ;j<i;j++){
                System.out.print(" ");
            }
            for(int a = 0;a< (2 * (sisi - i) - 1); a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
