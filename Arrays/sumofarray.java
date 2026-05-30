import java.util.*;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.printf("Enter %d elements into array: ",size);
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         int sum=0;
         
         for(int i=0;i<arr.length;i++){
            sum+=arr[i];
         }
         System.out.print("Sum of the array is : "+sum);
    }
}
