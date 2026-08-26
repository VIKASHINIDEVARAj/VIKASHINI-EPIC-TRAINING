package Looping;
import java.util.Scanner;

public class CharacterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        for (int i = 1; i <= val.length(); i++) {
            int result= (int) val.charAt(i);
            System.out.println((char)(result+1));

        }


    }

}
