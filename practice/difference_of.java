import java.util.*;

public class difference_of {
    public static void main(String args[]){
        // Difference of 3 -> 2,5,8,11,15 upto n
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i+=3){
            System.out.printf("\t %d",i);
        }

    }
}
