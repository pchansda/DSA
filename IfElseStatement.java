import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        do {
            int marks = input.nextInt();

            if (marks > 0 && marks < 25) {
                System.out.println("Grade: F");

            } else if (marks >= 25 && marks <= 44) {
                System.out.println("Grade: E");

            } else if (marks >= 45 && marks <= 49) {
                System.out.println("Grade: D");

            } else if (marks >= 50 && marks <= 59) {
                System.out.println("Grade: C");

            } else if (marks >= 60 && marks <= 69) {
                System.out.println("Grade: B");

            } else if (marks >= 70 && marks <= 100) {
                System.out.println("Grade: A");

            } else {
                System.out.println("Invalid marks entered.");
            }
            System.out.println(" Do you want check another marks : ( y/n )");
            ch = input.next().trim().charAt(0);
        }
        while (ch == 'y' || ch == 'Y');
    }
}

