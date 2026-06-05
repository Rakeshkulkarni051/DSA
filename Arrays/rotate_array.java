public class rotate_array {
    public static void main(String[] args) {
        int[] arr={3,4,6,2,8,11};
        int r=3;
        int arr_cpy[]=new int[arr.length-r];
        int cpy_index=0;

        for(int i=r;i<arr.length;i++){
            arr_cpy[cpy_index]=arr[i];
            cpy_index++;
        }

        for(int ele:arr_cpy){
            System.out.print(" "+ ele);
        }

        for(int i=0;i<r;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
