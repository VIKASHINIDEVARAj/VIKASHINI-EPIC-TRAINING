package Array;
import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();// size = 6
        int sum=0;
        int[] arr = new int[size];// array of integers
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}