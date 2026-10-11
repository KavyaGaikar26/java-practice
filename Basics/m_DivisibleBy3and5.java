package Basics;
import java.util.*;

public class m_DivisibleBy3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 15 == 0) {
            System.out.print("Both");
        }
        else if (n % 5 == 0) {
            System.out.print("Only 5");
        }
        else if (n % 3 == 0) {
            System.out.print("Only 3");
        }
        else {
            System.out.println("Neither");
        }
    }
}
