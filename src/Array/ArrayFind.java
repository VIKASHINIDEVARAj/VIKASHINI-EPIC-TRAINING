package Array;
import java.util.Scanner;

public class ArrayFind
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //dynamic array
        int size = in.nextInt();//4
        int[] arr = new int[size];//arr[4]; 1 4 7 34
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int search = in.nextInt();//34
        boolean val=true;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==search)
            {
                val=false;
                System.out.print("Present");
                break;
            }
        }
        if(val){
            System.out.println(" not found ");
        }

    }
}
