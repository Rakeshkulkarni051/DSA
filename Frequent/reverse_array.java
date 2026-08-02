

public class reverse_array {
    public static void main(String args[]){
        int arr[]={3,7,4,5,9,2};
        int n=arr.length-1;
        int i=0,j=n;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int s : arr){
            System.out.println(s);
        }
    }
}
