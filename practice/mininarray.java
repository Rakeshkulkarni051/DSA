public class mininarray {
    public static void main(String args[]){
        int arr[]={3,5,4,7,10};  
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min value in array is : "+min);


    }
}
