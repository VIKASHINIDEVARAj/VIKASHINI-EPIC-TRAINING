package Looping;
import java.util.Scanner;

public class Mystery
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int output = str.charAt(0)-'0';
    //a=97-122,A=65-90,0=48-57
        for (int i = 1; i <= str.length()/2; i++)
        { // divide the string to operands and operators
            char operator = str.charAt(i+ (str.length()/2));
            int current = str.charAt(i)-'0';
            switch (operator)
            {
                case '+':
                    output = output + current;
                    break;
                case '-':
                    output = output - current;
                    break;
                case '*':
                    output = output * current;
                    break;
                case '/':
                    if (current != 0) {
                        output = output / current;
                    }
                    else{
                        System.out.println("Error");
                    }
                    break;
                default:
                    System.out.println("Unknown operator");
            }
            System.out.println(output);
            sc.close();
        }
    }
}