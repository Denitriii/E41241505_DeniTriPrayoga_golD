/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acara9dan10;
import java.util.Scanner;

public class bilanganGenapFOR {

    
    public static void main(String[] args) {
       Scanner bilangan = new Scanner(System.in);
       int bilangan1,bilangan2;
        System.out.print("input bilangan satu : ");
        bilangan1 = bilangan.nextInt();
        System.out.print("input bilangan dua : ");
        bilangan2 = bilangan.nextInt();
        
        for(int i =bilangan1 ; i<bilangan2;i++){
            
            if(i % 2 == 0){
                System.out.println(i);
            }
                
            }
        }
    }
    

