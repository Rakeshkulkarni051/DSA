import java.util.Scanner;

class divisible {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number to check if its divisible by 5: ");
        int x=sc.nextInt();
        if(x%5==0){
            System.out.println("Number is Divisble by 5");
        }
        else{
            System.out.println("Number is not Divisible by 5");
        }
        sc.close();
    }


}
