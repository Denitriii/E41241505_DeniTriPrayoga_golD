package sem2minggu4;

public class sequntialSearch {
    public static void sequntialSearch(int []arr, int target){
        int index = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                
                index = i;
                break;
            }
        }
        if(index==-1){
            System.out.println("target yang diinput tidak ditemukan");
        }
        else{
            System.out.println("target ditemukan pada index "+index);
        }
}
    public static void main(String[] args) {
        int [] testing = {1,88,90,76,77,85,35,21};
        int target = 76;
        sequntialSearch(testing,target);
    }
}
