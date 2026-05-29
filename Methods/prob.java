// Take n & r as input and print ncr and npr using method

// ncr = nfact/rfact*nrfact
//npr =nfact/n-r fact
import java.util.Scanner;

public class prob {


    public static int fact(int x){
        int factn=1;
        for(int i=1;i<=x;i++){
            factn=factn*i;
        }
        return factn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

       
       int ncr=fact(n)/(fact(r)*fact(n-r));
        int npr=fact(n)/fact(n-r);
      
        System.out.println("NCR is: "+ncr );
        System.out.println("NPR is: "+npr );

        
    }


}
