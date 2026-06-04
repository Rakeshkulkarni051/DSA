import java.util.Arrays;

public class even_oddshift {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int arr_even[]=new int[arr.length];
        int arr_odd[]=new int[arr.length];
        int j=0;
        int k=0;

        // even 
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr_even[j]=arr[i];
                 j++;
            }
           
        }

         Arrays.sort(arr_even,0,j);
        for(int i=j-1;i>=0;i--){
     System.out.print(" "+arr_even[i]);
        }

        // odd 
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr_odd[k]=arr[i];
                 k++;
            }
           
            
        }

        for(int i=0;i<k;i++){
    System.out.print(" "+ arr_odd[i]);
        }
       

    }
}
