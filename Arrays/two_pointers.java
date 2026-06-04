public class two_pointers {

    public static void main(String[] args) {
        
        int arr[]={4,2,8,12,5,13,9};
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int ele : arr){
            System.out.printf(" %d \t",ele);
        }
    

    }
    
}
