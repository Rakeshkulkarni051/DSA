public class triangle {
    public static void main(String args[]){
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
System.out.println("-------------");

       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println("");
        }
System.out.println("-------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+(char)(j+64));
            }
            System.out.println("");
        }
    System.out.println("-------Alpha Numeric ------");
    //1
    // AB
    // 123
    // ABCD
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i%2==0){
                 System.out.print(" "+(char)(j+64));
            }
            else{
               System.out.print(" "+j);
            }
        }
        System.out.println("");
    }

    }
}
