import java.util.*;
public class sum_arr {
    public static void main(String args[]){
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            System.out.println("Enter elements into array: ");
            int arr[]=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
             System.out.println("Elements in array");
            for(int i=0;i<arr.length;i++){
                System.out.printf(" %d \t",arr[i]);
            }
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i]; //sum+=arr[i]
            }

            System.out.println("Sum of array: "+sum);




        sc.close();
    
    }
}
