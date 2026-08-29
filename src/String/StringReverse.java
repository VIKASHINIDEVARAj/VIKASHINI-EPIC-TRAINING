package String;

import java.util.Scanner;

public class StringReverse
{
    static String reverseString(String str)
    {
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--)
        {
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(reverseString(str));
    }

}















//package stringutils; // Proper package name
//
//import java.util.Scanner;
//
//public class StringReverseOptimized {
//
//    // Logic-a thaniya oru method-la ezhudhanum (Reusability!)
//    static String reverseString(String str) {
//        // PRO TIP 1: Edge case handling! Interviewer idhai thaan first paapanga.
//        if (str == null || str.isEmpty()) {
//            return str;
//        }
//
//        // PRO TIP 2: One-line magic using StringBuilder
//        return new StringBuilder(str).reverse().toString();
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a string to reverse: ");
//        String str = in.nextLine();
//
//        // Method-a call pandrom
//        String reversed = reverseString(str);
//        System.out.println("Reversed String: " + reversed);
//
//        // PRO TIP 3: Always close your resources to avoid memory leaks!
//        in.close();
//    }
//}