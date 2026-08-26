package Looping;

public class Kaprekar {
    public static void main(String[] args){
        int num=27;
        int square=num*num;
        System.out.println(square);
        int cut=100;
        int right = square % cut ;
        int left = square / cut ;
        int rl=right+left;
        System.out.println(rl);
        if (rl == num) {
            System.out.println("Kaprekar Number");
        }
        else{
            System.out.println("Nahi !");
        }

    }
}
