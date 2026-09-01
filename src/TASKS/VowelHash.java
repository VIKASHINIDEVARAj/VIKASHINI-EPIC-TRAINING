package TASKS;
import java.util.Scanner;
public class VowelHash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
                System.out.print("$");//vowel
            }
            else {
                System.out.print("#");//consonant
            }
        }

    }
}
