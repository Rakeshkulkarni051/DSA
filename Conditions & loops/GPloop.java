public class GPloop {
    public static void main(String args[]){
        // GP from 1,2,4,8
        int n=10;
        int a=1,r=2;
        for(int i=1;i<=n;i++){ //or i=i*2 print i
            System.out.println(" "+a);
            a=a*r;
        }

        //pattern 2 
         System.out.println(" -----------------" );
        int m=5;
        for(int i=1;i<=10;i++){
            System.out.println(" "+ i);
            System.out.println(" "+ m);
            m=m-i;
        }


    }
}
