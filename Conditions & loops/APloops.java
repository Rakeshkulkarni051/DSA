import java.util.*;
public class APloops {
    public static void main(String args[]){
        //Display AP of 2,5,8,11.. upto n
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i=i+3){
            System.out.println(" "+ i);
        }


        //AP OF 4,10,16,22,28..
         for(int i=4;i<=28;i=i+6){
            System.out.println(" -- "+ i);
        }

        //Pattern from 99,95,91,87..
        for(int i=99;i>1;i=i-4){
            System.out.println("__"+i);
        }
    }
}
