import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        char opt;
        do {
            Scanner input = new Scanner(System.in);
            char ch = input.next().trim().charAt(0);

            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lowercase");
            } else {
                System.out.println("Uppercase");
            }
            System.out.println(" Do you want check another Character : ( y/n )");
             opt = input.next().trim().charAt(0);
        }
        while (opt == 'y' || opt == 'Y');
    }
}
