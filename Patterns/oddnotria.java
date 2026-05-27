public class oddnotria {
    public static void main(String[] args) {
        // 1
        // 13
        // 135
        // 1357
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){ //j<=2*i
                // if(j%2==1){
                     System.out.print(" " +(2*j-1));
               // } 
            }
            System.out.println("");
        }

    }
}
