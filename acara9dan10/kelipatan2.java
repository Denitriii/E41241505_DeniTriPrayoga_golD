/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara9dan10;

/**
 *
 * @author user
 */
public class kelipatan2 {
    public static void main(String[] args) {
        System.out.println("\t Do-While");
        System.out.println("bilangan kelipatan 2 ");
        
        int pangkat = 0;
        int jumlah;

        do {
            jumlah = (int) Math.pow(2, pangkat);
            if(jumlah > 100)break;
            System.out.println(jumlah);
            pangkat++;
        } while (true);
        
    }
}
