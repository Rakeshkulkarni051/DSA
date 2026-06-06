import java.util.Arrays;

public class tcs_nqt_diff {
    public static void main(String[] args) {
        // given 2 1 assending and decending array make new array merge both in assending 
        int a[]={1,3,4,7,11,14};
        int b[]={12,9,8,5,2,0};
        int size=a.length+b.length;
        int c[]=new int[size];
        int index=0;

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
            index++;
        }

        for(int j=0;j<b.length;j++){
            c[index]=b[j];
            index++;
        }
        

        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            System.out.print(" "+c[i]);
        }
    }
}
