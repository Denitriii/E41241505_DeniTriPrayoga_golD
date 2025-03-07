package sem2minggu4;

public class bubleesort {

    static void bubblesort(int[] arr){
        int n = arr.length;
        int temp = 0;
        
        for(int i = 0;i<n;i++){
            for(int j = 1 ; j <(n-i);j++){
                
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] angka = {1,99,100,134,88,3,5,9};
        
        System.out.println("array sebelum menggunakan bubblesort");
        for(int i = 0; i <angka.length; i++){
            System.out.print(angka[i]+" ");
        }
        System.out.println("");
        System.out.println("array setelah menggunakan bubblesort");
        bubblesort(angka);
        
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i]+" ");
        }
    }
    
}
