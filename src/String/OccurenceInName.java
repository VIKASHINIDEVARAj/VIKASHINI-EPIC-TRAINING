package String;
import java.util.Scanner;

public class OccurenceInName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int val=str.charAt(i)-97;
            count[val]++;
        }
        System.out.println();
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i) - 97;
            if(count[val]>0){
                System.out.println(str.charAt(i)+"="+count[val]);
            }
            if(count[val]>1){
                count[val]=0;
            }
        }
    }
}
