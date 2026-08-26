package Array;
import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();// max=7
        int[] arr = new int[size];
        int max=0;
        for(int i = 0; i < size; i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
