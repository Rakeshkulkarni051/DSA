import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Number to Reverse: ");
        int n=sc.nextInt();
        // int dig=0;
        // System.out.print("reverse of given number : \t ");
        // while(n!=0){
        //     dig=n%10;
        //     System.out.print(""+dig);
        //     n=n/10;
        // }

        int rev=0;
        while(n!=0){
            rev=rev*10;
            rev=rev+n%10;
            n=n/10; //n/=10;
        }

        System.out.println("Reverse of given number is : " +rev); 
         
        sc.close();
    }
}
