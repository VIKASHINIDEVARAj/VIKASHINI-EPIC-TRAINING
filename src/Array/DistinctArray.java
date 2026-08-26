package Array;
import java.util.Scanner;

public class DistinctArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();//8
        int[] arr = new int[size];//8
        for (int i = 0; i < size; i++)
            {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            int j;
            for ( j = 0; j < size; j++)
            {
                if (arr[i] == arr[j]  && i!=j)
                {
                    break;

                }

            }
            if (j == size) {
                System.out.println(arr[i]+ " ");
            }

        }

    }
}