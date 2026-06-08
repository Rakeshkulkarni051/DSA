public class comman_no {
    public static void main(String[] args) {
        // Find the comman element in all 3 sorted array - BruteForce
        int a[] = {10,14,23,50,54};
        int b[] = {14,18,23,30,32};
        int c[] = {14,15,23,27,22};

        System.out.println("Common elements are:");

        for(int i = 0; i < a.length; i++) {

            boolean foundinB = false;
            boolean foundinC = false;

            // Search in B
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    foundinB = true;
                    break;
                }
            }

            // Search in C
            for(int k = 0; k < c.length; k++) {
                if(a[i] == c[k]) {
                    foundinC = true;
                    break;
                }
            }

            if(foundinB && foundinC) {
                System.out.println(a[i]);
            }
        }
    }
}