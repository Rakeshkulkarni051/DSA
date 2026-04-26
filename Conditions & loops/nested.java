class nested{
    public static void main(String args[]){
        int a=12,b=11,c=100;
        if(a>b){
            if(a>c){
                System.out.println("A is gratest");
            }
            else{
                System.out.println("C is the greatest");
            }
        }
        if(a<b){
            if(b>c){
                System.out.println("B is gratest");
            }
            else{
                System.out.println("C is the greatest");
            }
        }
    }

}