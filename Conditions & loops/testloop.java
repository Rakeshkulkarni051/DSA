public class CrazyLoop {
    public static void main(String[] args) {

        for(int i = 1, j = 10;
            i <= 10 && j >= 1;
            System.out.println("i = " + i + "  j = " + j),
            i++, j--) {

            System.out.print((i * j) + " ");
        }
    }
}
