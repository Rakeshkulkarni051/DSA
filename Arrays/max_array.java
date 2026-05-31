import java.util.Scanner;

public class max_array {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.printf("Enter %d elements into array: ",size);
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         int max=0; // or use max=Interger.MIN_VALUE

         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
         }
         System.out.println("max element in the array is "+max);
    }
}
