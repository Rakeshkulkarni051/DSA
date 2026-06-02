import java.util.*;
public class odd_evenidx {
    // multiply odd index by 2 and even index by adding 10
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.printf("Enter %d elements into array:  ",size);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Raw array : ");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d \t ",arr[i]);
        }
        System.out.println("");

        System.out.println("Prob: even by +10 and odd by X2 ");
        for(int i=0;i<arr.length;i++){

            if(i%2==0 || i==0){
                System.out.printf("%d \t",arr[i]+10);
            }
            else{
                
                 System.out.printf("%d \t",arr[i]*2);
            }
        }


        sc.close(); 
    }
}
