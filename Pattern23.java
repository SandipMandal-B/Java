public class Pattern23 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 3; i++) {
            
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
