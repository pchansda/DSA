import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;
        while(true){
            //Take operator
            System.out.println("Input operator : ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op =='%'){
                //Enter any teo numbers
                System.out.println("enter any two number : a");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    ans = num1 / num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("Invalid Input");
            }
            System.out.println(ans);
        }
    }
}
