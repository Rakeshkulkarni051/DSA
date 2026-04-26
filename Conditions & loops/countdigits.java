import java.util.*;
public class countdigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Number to check Digits: ");
        int n=sc.nextInt();
        //int counter=0;
        int counter=0;
         while(n!=0){
                 counter++;
             n=n/10;
         }
        System.out.println("Digits : "+counter);
    sc.close();
    }
}
