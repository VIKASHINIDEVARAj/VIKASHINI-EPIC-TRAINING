package Array;
import java.util.Scanner;

public class SmallestNearElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int element = in.nextInt();//5
        int[] arr = new int[element];//16 8 14 7 11 9

        for (int i = 0; i < element; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < element-1; i++) {
            int out = -1;// for last element
            for (int j = i + 1; j < element; j++) {
                if (arr[j] < arr[i]) {
                    out = arr[j];
                    for (int k = j + 1; k < element; k++) {
                        if (arr[i] > arr[k] && arr[k] > out) {
                            out = arr[k];
                        }
                    }
                    break;
                }
            }

            System.out.println(out);
        }
        System.out.println(-1);

    }
}






