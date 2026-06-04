public class rev_partofarray {
    public static void main(String[] args) {
        int arr[]={3,4,2,5,6,9,7}; // reverese 2 , 5 , 6
        int n=arr.length;
        int i=2;
        int j=n-2-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(" "+ele);
        }

    }
}
