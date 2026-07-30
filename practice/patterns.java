public class patterns {
    public static void main(String[] args) {

        //triangle
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


        //alpha triangle
        int n=65;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+(char)(n));
                 n++;
            }
            System.out.println();
        }
        

    }
}
