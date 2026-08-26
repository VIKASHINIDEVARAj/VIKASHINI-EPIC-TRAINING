package Pattern;

public class XStar
{
    public static void main(String[] args)
    {

        int n=5;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j || (i + j) == (n-1))//9-1=8(0,8)
                {
                    System.out.print(j+1);//*
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("  ");
        }
    }
}
