//package Methods;

public class method_calls {

   public static void name_c(){
        name_b();
        System.out.println("name c");
   }
    
    public static void main(String[] args) {
        name_a();
    }

    public static void name_b(){
         System.out.println("name b");
    }


     public static void name_a(){
        name_b();
        name_c();
        System.out.println("name d");
        name_c();
    }
}
