import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 2, 6, 9, 1, 4, 3,};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static boolean swapped;
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 1; j < arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
