package Basics;
import java.util.*;

public class p_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90 ) {
            System.out.print("A");
        }
        else if (marks >= 80) {
            System.out.print("B");
        }
        else if (marks >= 70) {
            System.out.print("C");
        }
        else if (marks >= 60) {
            System.out.print("D");
        }
        else if (marks < 60) {
            System.out.print("F");
        }
    }
}
