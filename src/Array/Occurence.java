package Array;
import java.util.Scanner;
public class Occurence
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            int count=1;
            for (int j = 0; j < size; j++)
            {
                if(i!=j)
                {
                    if (arr[i] == arr[j] && j>i)
                    {
                        count++;
                    } else if (j<i && arr[i] == arr[j])
                    {
                        count=0;
                        break;

                    }
                }

            }
            if (count > 0)
            {
                System.out.println(arr[i] + ":" + count);
            }

        }

    }
}
