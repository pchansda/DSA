import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int rev = 0;
        while(x > rev){
            int rem = x%10;
            x /= 10;
            rev = (rev * 10) + rem;
        }
        if(x == rev || x == rev / 10){
            System.out.println("Palindrome");
        }else
            System.out.println("Not a Palindrome");
    }
  }
