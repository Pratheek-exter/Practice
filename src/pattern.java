public class pattern {
    //pattern box
    public static void main(String[] args) {
        int n = 4;          //nested loop
        int m = 5;

        ///outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j < m; j++) {
                System.out.print("*");
            }

            System.out.println();
        }//loop 2 pattern --> hollow box
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }//pattern --> half pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}