import java.util.Scanner;

public class sumofdig {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Number to find sum of Digits: ");
        int n=sc.nextInt();
        //865 8+6+5=
        int sum=0;
       // int value=0;
        while(n!=0){ 
            sum+=n%10;
            n=n/10;
        }
        System.out.println("Sum of digits : "+ sum);



        sc.close();
    }
}
