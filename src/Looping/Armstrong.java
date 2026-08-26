package Looping;

public class Armstrong {
        public static void main(String[] args) {
           int num = 15;
           int temp=num;
           int sum=0;
           while (num>0)
           {
               int digit =num % 10;
               sum = sum + (digit*digit*digit);
               num = num / 10;
           }
            if (sum == temp) {
                System.out.println("Armstrong: " + sum);
            }
            else {
                System.out.println("It is not");
            }

        }
}


