public class third_larges {
    public static void main(String[] args) {
        int arr[]={3,5,2,1,8,10};
        int f_max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;
        int t_max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>f_max){
                f_max=arr[i];
            }
        }
        System.out.println("First largest: " +f_max);
        for(int j=0;j<arr.length;j++){
            if(arr[j]>s_max && arr[j]!=f_max){
                s_max=arr[j];
            }
        }
        System.out.println("Secound largest: " +s_max);
        for(int k=0;k<arr.length;k++){
            if(arr[k]>t_max && arr[k]!=f_max && arr[k]!=s_max){
                t_max=arr[k];
            }
        }

        System.out.println("third largest: " +t_max);

    }
}
