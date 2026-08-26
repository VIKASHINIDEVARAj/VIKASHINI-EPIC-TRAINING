package Looping;

public class SumOfFactorial {
    public static void main(String[] args) {
        int num = 156;
        int sum = 0;
        while (num > 0) {
            int pro = 1;
            for (int i = num % 10; i >= 1; i--) {
                pro = pro * i;
                //pro = 1*1
            }
            sum = sum + pro;
            //sum=720+120+1
            //
            num = num / 10;//1

        }

        System.out.print(sum);
    }
}
//        int factorial=1;
//        for (int i = 1; i < num % 10; i++)
//        {
//            factorial*=i;
//            sum+=factorial;
//            num=num/10;
//
//        }

