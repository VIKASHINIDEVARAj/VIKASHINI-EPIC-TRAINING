package Array;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {7,2,6,3,4};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j < n; j++) {
                    if (arr[j] < arr[i] && i != j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
                    else
                    {
                        for (int j = i + 1; j < n; j++)
                        {
                            if (arr[j] > arr[i]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }

                        }
                    }
                }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");

        }

            }
        }




//j checks all
//j should check all odd places behind when i is behind




