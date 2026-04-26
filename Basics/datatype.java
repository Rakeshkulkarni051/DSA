import java.util.*;

public class datatype {
    public static void main(String args[]){
        Double l,w,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("To find the volume and surface area of a cuboid");
        System.out.println("Enter lenght  ");
        l=sc.nextDouble();
        System.out.println("Enter width  ");
        w=sc.nextDouble();
        System.out.println("Enter height  ");
        h=sc.nextDouble();
        double volume=l*w*h;
        System.out.println("Volume of the Cuboid: " + volume);
        double surface=2*(l*w+l*h+w*h);
        System.out.println("Total surface are TSA : "+ surface);
        sc.close();

    }
}
