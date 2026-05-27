import java.util.*;
public class profit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cost Price: ");
        int cp=sc.nextInt();
        System.out.println("Enter selling price: ");
        int sp=sc.nextInt();
        if(cp<sp){
            int profit = sp - cp;
            double profitPercentage = (profit * 100.0) / cp;
            System.out.println("Profit of RS: " + profit);
            System.out.println("Profit Percentage: " + String.format("%.2f", profitPercentage) + "%");
        }
        else if(cp==sp){
            System.out.println("Neither profit nor any loss");
        }
        else{
            int loss = cp - sp;
            double lossPercentage = (loss * 100.0) / cp;
            System.out.println("Loss of RS : " + loss);
            System.out.println("Loss Percentage: " + String.format("%.2f", lossPercentage) + "%");
        }

    }
}
