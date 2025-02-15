
package acara7dan8;
import java.util.Scanner;

public class lat_if {
    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner penilaian = new Scanner(System.in);
        System.out.print("masukan nilaimu : ");
        nilai = penilaian.nextInt();
        
        //penilain penentuan grade
        if(nilai >= 90){
            grade = "A";
        }else if(nilai >= 80){
            grade = "B+";
        }else if(nilai >= 70){
            grade = "B";
        }else if(nilai >=60){
            grade = "C+";
        }else if(nilai >= 50){
            grade = "C";
        }else if(nilai >= 40){
            grade = "D";
        }else{
            grade = "E";
        }
        
        // menampilkan grade
        System.out.println("Grade : "+grade);
    }
}
