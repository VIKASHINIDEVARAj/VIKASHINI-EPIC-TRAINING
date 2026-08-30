package TASKS;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();

        int[][] arr=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
             arr[i][j]= sc.nextInt();
            }
        }
        int[][] trans =new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i]=arr[i][j];//swapping
                System.out.println(trans[j][i]+" ");
            }
        }
        System.out.println();
    }
}
