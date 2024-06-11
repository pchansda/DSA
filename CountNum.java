import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Count(n);
    }
    static void Count(int n){
        int count = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
