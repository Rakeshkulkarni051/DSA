public class starplus {
    public static void main(String[] args) {
        int row=7,col=7;
       int  mid1=row/2+1,mid2=col/2+1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==mid1 || j==mid2)   {                 // if(i==3 || j==3){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
    }
}
