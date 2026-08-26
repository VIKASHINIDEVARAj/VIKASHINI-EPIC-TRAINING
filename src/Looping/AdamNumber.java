package Looping;

public class AdamNumber {
    public static void main(String[] args){
        int num=12;
        int rev=0;
        int square=num*num;
        System.out.println(square);
        while ( num > 0 )
        {
            int n = num % 10;
            rev=(rev*10)+n;
            num=num/10;
        }
        System.out.println(rev);

        int ulta=rev*rev;
        System.out.println(ulta);

        int revUlta = 0;
        while (ulta > 0)
        {
            int digit = ulta % 10;
            revUlta = (revUlta * 10) + digit;
            ulta = ulta / 10;
        }

        if (revUlta == square) {
            System.out.println("Adam than");
        }
        else {
            System.out.println("Adam Illa");
        }
    }
}
