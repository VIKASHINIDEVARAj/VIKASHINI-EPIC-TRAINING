package Pattern;
import java.util.Scanner;
public class LeftTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        for (int i = 1; i <=val; i++) {// column

            for (int j = 1; j <=i; j++) { //prints star
                //for (int j = 1; j <=i+1; j++)
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
