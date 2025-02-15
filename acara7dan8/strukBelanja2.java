package acara7dan8;
import java.util.Scanner;
public class strukBelanja2 {
    public static void main(String[] args) {
        String nama,menu;
        Scanner input = new Scanner(System.in);
        //desain struk
        System.out.println("-------------------------------------");
        System.out.println("            CAFE COFE JAVA");
        System.out.println("                 WARKOP");
        System.out.println("-------------------------------------");
        System.out.println("           Daftar Menu :\n"
                + "              1. Kopi susu\n"
                + "              2. Kopi hitam\n"
                + "              3. Es teh\n"
                + "              4. Americano\n");
        System.out.println("-------------------------------------");
        System.out.print("masukan nama pembeli : ");
        nama = input.nextLine();
        System.out.print("silahkan pilih menu : ");
        menu= input.nextLine();
        // implementasi switch dari memilih menu
        switch(menu){
            case "1":
                 System.out.println("Menu yang anda pilih adalah : Kopi susu");
                 break;
            case "2":
                System.out.println("Menu yang anda pilih adalah : Kopi hitam");
                break;
            case "3":
                System.out.println("Menu yang anda pilih adalah : Es teh");
                break;
            case "4":
                System.out.println("Menu yang anda pilih adalah : Americano");
                break;
            default:
                System.out.println("Menu tidak terdaftar");
        }
        
        System.out.println("Pesanan sedang dibuat mohon tunggu sebentar");
        System.out.println("Terimah kasih "+nama+"telah berkunjung di CAFE COFE JAVA");
    }
}
