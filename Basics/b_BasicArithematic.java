package Basics;
import java.util.*;

public class b_BasicArithematic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Division: " + ((double)(a) / (double)(b)));
        System.out.println("Remainder: " + (a % b));
    }
    
}
