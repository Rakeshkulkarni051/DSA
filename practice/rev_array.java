import java.util.Scanner;

public class rev_array {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array: ");
       int size=sc.nextInt(); 
       int arr[]=new int[size];
        System.out.println("Enter elements into array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Orginal array: ");
        for(int ele:arr){
            System.out.print(" "+ ele);
        }
        System.out.println();
        System.out.println("Reverse array: ");
        int i=0,j=size-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int rev:arr){
            System.out.print(" "+rev);
        }
        sc.close();
    }
}
