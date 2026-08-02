public class secound_max {
    public static void main(String args[]){
        int arr[]={10,23,15,32,8,20};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]>sec_max && arr[j]!=max){
                sec_max=arr[j];
            }
        }
        System.out.println("Secound largest number : "+sec_max);
    }
}
