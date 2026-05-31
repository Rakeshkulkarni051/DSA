public class min_array {
    public static void main(String[] args) {
        int arr[]={20,6,12,4,7,3,20};
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min element in the array : "+min);


    }
}
