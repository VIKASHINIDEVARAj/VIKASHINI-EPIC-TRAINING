package Looping;
import java.util.Scanner;

public class CountDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        int value=1;
        while(n>0)
        {//n/value>0
            n=n/10;//value=value*10
            count++;
        }
        System.out.print(count);
    }

}
