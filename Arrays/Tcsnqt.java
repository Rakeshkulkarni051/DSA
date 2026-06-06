import java.util.Scanner;

public class Tcsnqt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of expense : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter trasactions : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Total expense :");
       int  total_exp=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==total_exp){
                        System.out.println(" " + i + " " + j + " " + arr[i] + " " + arr[j]);
                    }
            }
            
        }
        
        // so we have to return 2 index which will be summed up to total expense 

       // ex: total exp 175 {50,30,150,25,60,75,100} return i,j,arri,arrj .
       // ex 2: total exp 50 {40,10,3,12}; // return i,j arri,arrj worked 


    }
}
