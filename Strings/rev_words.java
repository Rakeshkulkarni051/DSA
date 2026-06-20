/**
 * rev_words
 */
public class rev_words {

    public static void main(String[] args) {
        String w="hello world java";
        String words[]=w.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+ " ");
        }
        }
    }