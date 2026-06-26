import java.util.Arrays;

public class remove_dublicate {
    //only works on sorted array
    public static void main(String args[]){
        int arr[]={3,4,2,1,2,3,5,6,3};
        System.out.println("Orginal non unique array : ");

        for(int ar:arr){
            System.out.print(" "+ar );
        }
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println();
        for(int k=0;k<i;k++){
            System.out.print(" "+arr[k]);
        }
    }
}
