/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara7dan8;

import java.util.Scanner;
public class lat_switchCase {
    public static void main(String[] args) {
        String lampu;
        Scanner color = new Scanner(System.in);
        
        // inputan warna lampu
        System.out.print("input warna : ");
        lampu = color.nextLine();
        
        // menentukan arti warna
        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, tolong berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, tolong hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            default:
                System.out.println("Lampu tidak terdaftar dalam kategori");
        }
    }
}
