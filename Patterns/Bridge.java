public class Bridge {
    public static void main(String[] args) {
        int n=7;
        
        //top road 
        for(int i=1;i<=2*n+1;i++){
            System.out.print("* ");
        }
        System.out.println("");

        for(int i=1;i<=n;i++){

            //left bridge
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }

            //space
            for(int k=1;k<=2*i-1;k++){
                System.out.print("  ");
            }

            //right bridge 
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

//         //space 
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }


//         //right bridge 
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("  ");
//             } 
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("* ");
//             }
             
//             System.out.println(" ");
//         }
 }
 }
