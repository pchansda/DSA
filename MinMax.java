import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int Max , Min ;

        if(a > b){
            Max = a;
            Min = b;
        }
        else{
            Max = b;
            Min = a;
        }
        if (c > Max ){
            Max = c;
        }
        if (c < Min){
            Min = c;
        }
        System.out.println("Max = "+Max);
        System.out.println("Min = "+Min);
    }
}
