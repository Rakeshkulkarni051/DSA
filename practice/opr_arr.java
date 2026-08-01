import java.util.*;
public class opr_arr {
    public static void main(String args[]){
        //int arr[]=new int[5];
        //int arr[]={2,4,5,61,2};
        // int arr[];
        // arr=new int[5];
        // arr[1]=10;
        // arr[0]=34;
        // System.out.println(arr[6]);


        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements into array max "+size);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements in the array : ");
        for(int s : arr){
            System.out.printf("%d \t",s);
        }
        sc.close();
    }
}
