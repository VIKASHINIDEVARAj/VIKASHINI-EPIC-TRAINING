package Array;
import java.util.Scanner;
public class MinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();// max=4
        int[] arr = new int[size];//6 8 5 3
        arr[0] = sc.nextInt();
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {

                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

