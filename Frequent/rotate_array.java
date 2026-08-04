//package Frequent;

public class rotate_array {

    public static void main(String args[]){

    int ar[]={2,1,4,2,6,12,5,7,3};
    // start n end positions 
    int start=3,end=6;

    int i=start;
    int j=end;

    while(i<j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
        i++;
        j--;
    }

    for(int ele:ar){
        System.out.println(ele);
    }
}
}
