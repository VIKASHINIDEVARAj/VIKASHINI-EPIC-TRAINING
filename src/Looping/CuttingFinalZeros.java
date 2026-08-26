package Looping;

public class CuttingFinalZeros
{
    public static void main(String[] args)
    {
        int n=1300;
        while(n%10==0)
        {
            n=n/10;//520 //52
        }
        System.out.println(n);
    }
}
