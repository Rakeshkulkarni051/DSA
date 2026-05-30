import java.util.*;
public class io {
    public static void main(String args[]){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Array Initialized! ");
        System.out.printf("Enter %d element into array : \n",size-1);
        for(int i=1;i<=size-1;i++){
            System.out.printf("Enter element at index %d :",i-1);
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements filled in array : ");
        for(int i=1;i<=size-1;i++){
            System.out.printf(" \t"+arr[i]);
        }
    }
}
