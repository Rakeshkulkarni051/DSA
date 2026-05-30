public class negative_val {

    //Given an array print nagative values only
    public static void main(String[] args) {
        int arr[]={3,-2,-6,8,9,-1,4,2,-4};

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(""+arr[i]);
            }
        }
    }
}
