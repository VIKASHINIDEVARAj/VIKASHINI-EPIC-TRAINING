package String;

public class Intro {
    public static void main(String[] args){
        //scp
        String str1="hello";//100
        String str2="hello";//100
        //heap
        String str3=new String("Hello");//200
        String str4=new String("Hello");//300
        System.out.println(str3==str4);
    }
}
