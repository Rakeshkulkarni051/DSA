import java.util.Arrays;

public class Sort_builtin {
    public static void main(String[] args) {
        int arr[]={2,1,12,15,6,3};
         System.out.println(" Unsorted raw array:  ");
        for(int i=0;i<arr.length;i++){
            System.out.printf(" \t " +arr[i]);
        }
      //  int x[]=arr; shallow copy
        Arrays.sort(arr);
        System.out.println("");
        System.out.println("sorted array in assending :  ");
        for(int i=0;i<arr.length;i++){
            System.out.printf(" \t " +arr[i]);
        }
        
    }
}
