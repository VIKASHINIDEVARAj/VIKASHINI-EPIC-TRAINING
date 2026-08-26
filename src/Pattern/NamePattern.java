package Pattern;
import java.util.Scanner;

public class NamePattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "VIKASHINI";
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j || (i + j) == (n-1))//9-1=8(0,8)
                {
                    System.out.print(s.charAt(j));

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("  ");
        }
    }
}
