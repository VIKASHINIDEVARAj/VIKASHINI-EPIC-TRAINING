package Looping;
public class Palindrome {
    public static void main(String[] args){
        int input = 123;
        int temp=input;
        int rev=0;
        while (input>0){
            int digit = input % 10;
            rev=(rev*10)+digit;
            input=input/10;
        }
        if (rev == temp) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not A Palindrome");
        }

    }
}
