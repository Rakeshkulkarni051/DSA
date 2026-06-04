public class Rev_Array {
    public static void main(String[] args) {
        int arr[]={4,13,14,6,8};
        int arre[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
                arre[i]=arr[arr.length-i-1];
          
        }

        for(int ele : arre){
            System.out.println(ele);
        }



    }
    
}
