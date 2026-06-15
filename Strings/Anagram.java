import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="Silent";
        String s2="Listen";

        String s1 = "Dormitory";
        String s2 = "DirtyRoom";

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char str1[]=s1.toCharArray();
        char str2[]=s2.toCharArray();

       

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1, str2)){
            System.out.println("String is Anagram");
        }
        else{
            System.out.println("String is not Anagram");
        }

    }
}
