public class secound_largest {
    public static void main(String[] args) {
        int arr[]={2,5,3,8,10,6};

        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;

        // find max val 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>sec_max && arr[i]!=max){ // or use arr<max
                sec_max=arr[i];
            }
        }
        
        System.out.println("Secound Largest element is : "+sec_max);
    }
}
