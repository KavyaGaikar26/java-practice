package Basics;
import java.util.*;

public class j_LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        }
        else if (a < b) {
            System.out.println(b);
        }
        else {
            System.out.println("a == b");
        }


        System.out.println(Math.max(a, b));
    }

}
