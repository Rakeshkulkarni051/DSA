import java.util.*;
class polindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to check for polindrome");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        
        int i=0,j=s.length()-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String rev=new String(ch);
        if(s.equals(rev)){
            System.out.println("string is pilindrome ");
        }
        else{
            System.out.println("String is not polindrome");
        }
        
   
   
   
   
   
   
   
   
   
   
   
   
        //    int rev=0;
    //     int no=sc.nextInt();
    //     int temp=no;
    //     while(no!=0){
    //          rev=rev*10;
    //         rev=rev+no%10;
    //         no=no/10;
    //     }
    //     if(rev==temp){
    //         System.out.println("Number is polindrome");
    //     }
    //     else{
    //         System.out.println("Number is not polindrome");
    //     }

    //     sc.close();

        
    }
}