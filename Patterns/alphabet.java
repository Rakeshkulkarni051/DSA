// n=4
// ABCD
// ABCD
// ABCD
// ABCD
import java.util.*;

public class alphabet {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                 System.out.print(" "+ (char)(j+64)); //+96 for small case 
            }
            System.out.println(" ");
        }

        //AAAA
        //BBBB
        //CCCC
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" "+(char)(i+64));
            }
            System.out.println("");
        }
       //aaaa
       //BBBB
       //cccc
       //DDDD
        System.out.println("-------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==0){
                    System.out.print(" "+(char)(i+64));
                }
                else{
                    System.out.print(" "+(char)(i+96));
                }
            }
            System.out.println("");
           
        }

    }
}
