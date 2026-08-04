public class dublicate_ele {
    public static void main(String args[]){
        int arr[]={11,4,2,4,5,11,6,8};
        
        for(int i=0;i<arr.length;i++){
          boolean dublicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    dublicate=true;
                    break;
                }
            }
            if(!dublicate){
                System.out.println(" "+arr[i]);
            }
        }

    }
}
