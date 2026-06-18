import java.util.*;

public class String_rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter your name to revers: ");
        s=sc.nextLine();
        System.out.println("Your orginal name : "+s);
        char str[]=s.toCharArray();
        int i=0,j=str.length-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        
        for(int k=0;k<str.length;k++){
            System.out.print(str[k]);
        }

        sc.close();
    }
}
