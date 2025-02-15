package acara7dan8;
import java.util.Scanner;
public class struckBelanja1 {
    public static void main(String[] args) {
          String nama,bonus;
          int barang1,barang2,barang3,barang4,barang5,total;
          Scanner input = new Scanner(System.in);
          // desain struk
          System.out.println("-----------------------------------------------------------");
          System.out.println("             KHARIZMA PLAZA MULIA  ");
          System.out.println("              Jl.Soedirman no.78");
          System.out.println("          DAPATAKAN BONUS MENARIK");
          System.out.println("-----------------------------------------------------------");
          System.out.print("masukan nama pembeli : ");
          nama = input.nextLine();
          System.out.print("masukan harga barang ke-1 : ");
          barang1 = input.nextInt();
          System.out.print("masukan harga barang ke-2 : ");
          barang2 = input.nextInt();
          System.out.print("masukan harga barang ke-3 : ");
          barang3 = input.nextInt();
          System.out.print("masukan harga barang ke-4 : ");
          barang4 = input.nextInt();
          System.out.print("masukan harga barang ke-5 : ");
          barang5 = input.nextInt();
          total = barang1+barang2+barang3+barang4+barang5;
          System.out.println("Total pembelian atas nama "+nama+" adalah Rp."+total);
           if(total >= 50000 && total <100000){
              bonus ="Piring cantik";
          }else if(total >= 100000){
              bonus = "Satu dus mangkok";
          }else{
              bonus = "total pembelian masih kurang untuk mendapatkan bonus";
          }
          System.out.println("Selamat.......");
          System.out.println("Anda mendapatkan bonus berupa "+bonus);
          System.out.println("---------------------------------------------------------");
          System.out.println("          Terimah kasih sudah belanja di");
          System.out.println("              KHARIZMA PLAZA MULIA");
          System.out.println("---------------------------------------------------------");
          
    }
}
