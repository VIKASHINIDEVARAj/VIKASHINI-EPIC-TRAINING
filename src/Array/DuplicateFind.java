package Array;
import java.util.Scanner;

public class DuplicateFind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();//8
        int[] arr = new int[size];//8
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    if (arr[i] == arr[j] && j > i) {
                        System.out.println(arr[i]);
                        break;
                    } else if (j < i && arr[i] == arr[j]) {
                        break;
                    }
                }
            }
        }
    }
}