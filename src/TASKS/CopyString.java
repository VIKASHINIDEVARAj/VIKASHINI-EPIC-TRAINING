package TASKS;
import java.util.Scanner;
public class CopyString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String cpy="";
        for (int i = 0; i < str.length(); i++) {
            cpy+=str.charAt(i);
            System.out.println(str);
            System.out.println(cpy);
        }
    }
}
