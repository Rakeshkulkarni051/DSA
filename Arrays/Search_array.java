import java.util.*;
public class Search_array {
    public static void main(String[] args) {
        // Linear Search

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int size=sc.nextInt();
        // 
        int arr[]=new int[size];
        System.out.println("");
        System.out.printf("Enter %d elements into array :  ",size);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("");

        System.out.println("Elements in the array : ");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d \t",arr[i]);
        }
         System.out.println("");
        System.out.println("Enter element to be Searched : ");
        int target=sc.nextInt();
        int flag=0,i;


        for(i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
             
        }
        System.out.println("");
        if(flag==1){
            System.out.printf("Element found at location %d ",i);
        }
        else{
            System.out.printf("Element %d not found ",target);
        }


        sc.close();
    }
}
