public class basics {
    public static void main(String[] args) {
        //method 1 direct init
        int arr[]={1,3,4}; // or int[] arr={};
        arr[0]=9;
        System.out.println(arr[0]);

        // initilize with size 
        int arp[]=new int[3];
        arp[2]=5;
        System.out.println(arp[2]);
    }
}
