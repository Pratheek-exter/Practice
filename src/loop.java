//Loops example code
import java.util.*;
public class loop {
    public static void main(String[] args) {
        int i = 0;          //while loop
        while (i < 11) {
            System.out.println(i);
            i = i + 1;
        }               //for loop
        for (i = 0; i < 11; i++) {
            System.out.println(i * i);
        }
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        int j = 100;
        for (i = 0; i < 11; i++) {
            System.out.println(j * i);
//pattern printing
        }

    }

}
