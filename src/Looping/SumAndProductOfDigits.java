package Looping;

public class SumAndProductOfDigits
{
    public static void main(String[] args)
    {
        int num=156;
        int product=1;

        while(num!=0)
        {
            product*=num%10;
            num=num/10;

        }
        System.out.println(product);
    }
}

//        int sum=0;
//        while(num>0)
//        {
//            sum+=num%10;
//            num=num/10;
//
//        }
//        System.out.print(sum);
