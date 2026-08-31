package String;
import java.util.Scanner;

public class OperatorOperand
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        int sum=str.charAt(0)-'0';
        int j=1;
        for (int i = (n/2)+1; i <n; i++) {
            switch (str.charAt(i))
            {

                case '-':
                {
                    sum-=(str.charAt(j)-'0');
                    break;
                }
                case '+':
                {
                    sum+=(str.charAt(j)-'0');
                    break;
                }
                case '*':
                {
                    sum*=(str.charAt(j)-'0');
                    break;
                }
                case '/':
                {
                    sum/=(str.charAt(j)-'0');
                    break;
                }
                case '%':
                {
                    sum%=(str.charAt(j)-'0');
                    break;
                }

            }
            j++;
            System.out.println(sum);
        }
    }
}
