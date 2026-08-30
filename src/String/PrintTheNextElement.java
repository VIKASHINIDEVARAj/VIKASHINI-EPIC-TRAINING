package String;
import java.util.Scanner;

public class PrintTheNextElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();//abc
        String str1="";
        for(int i = 0; i < str.length(); i++)
        {
        char change=str.charAt(i);
        char change2=(char)((change - 'a' + 1) % 26 + 'a');
        str1+=change2;
        }
        System.out.println(str1);
    }
}

/*
when calculations done in char java converts to int
char → calculation happens → int → convert back → char
the char in (char)((change - 'a' + 1) % 26 + 'a'); is used to turn to int from char
*/
