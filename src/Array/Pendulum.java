package Array;
public class Pendulum {
    public static void main(String[] args) {
        int[] arr = {23, 5, 27, 2, 12, 30};
        int n = arr.length;
        int split = n + 1 / 2;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n; k++) {


                    if (i < split) {
                        result[i] = arr[i];
                        j -= 2;
                    } else {
                        result[i] = arr[k];
                        k += 2;
                    }
                }


            }


        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
