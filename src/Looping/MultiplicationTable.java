package Looping;
import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <=10; i++)
        {
            System.out.println("MULTIPLE:" + n * i+ " ");
        }

    }
}
// for (int i=n;i<=n*10;i+=n){//5
//sout (i)