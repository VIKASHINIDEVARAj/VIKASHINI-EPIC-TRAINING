package TASKS;
import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        if (one.length() == two.length()) {
            System.out.println("equal");
        } else if (one.length() < two.length()) {
            System.out.println("String 1 is smaller");
        } else {
            System.out.println("String 1 is greater");
        }


    }
}
