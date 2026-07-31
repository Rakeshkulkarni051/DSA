public class patterns {
    public static void main(String[] args) {

        // //triangle
        // for(int i=0;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }


        // //alpha triangle
        // int n=65;
        // for(int i=0;i<=5;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(" "+(char)(n));
        //          n++;
        //     }
        //     System.out.println();
    //}
      // Horizontal Flip
    //  int n=5;
    //  int m=1;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i+1;j++){
    //             System.out.print(" "+m+" ");
    //             m++;
    //         }
    //         System.out.println("");
    //     }
    
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print("  ");
    //     }
    //     for(int k=1;k<=i;k++){
    //         System.out.print(" "+k);
    //     }
    //     System.out.println("");
    // }
     //hortizontal verticle flipped 
     int n=5;
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=n-i+1;k++){
            System.out.print("* ");
        }
        System.out.println("");
     }



    }
}
