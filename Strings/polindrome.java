

public class polindrome {
    public static void main(String args[]){
        String s="madam";
        char ch[]=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            
        }
        String rev=new String(ch);
        if(s.equals(rev)){
            System.out.println("String is polindrome");
        }
        else{
            System.out.println("String is not polindrome");
        }
    }
}
