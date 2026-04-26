public class flipedtriangle {
    public static void main(String[] args) {
        // **** or 1234
        // ***     123
        // **      12
        // *       1
        int n=5;
        for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){    // for(int j=n;j>=i;j--)-> from 5 to 1 
                System.out.print(" "+j);
            }
            System.out.println("");
        }
        System.out.println("--------------");
        // abcd 
        // abc
        // ab
        // a 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" "+(char)(j+96));
            }
            System.out.println("");
        }
        System.out.println("--------------");
        // AAAA 
        // BBB
        // CC
        // D
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" "+(char)(i+64));
            }
            System.out.println("");
        }
    }
}
