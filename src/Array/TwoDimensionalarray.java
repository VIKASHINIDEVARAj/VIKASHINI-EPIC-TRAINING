package Array;

public class TwoDimensionalarray {
    public static void main(String[] args){
        int[][] arr = new int[3][3];
        int[][] arr1 ={
                {1,2,3},//(0,0)(0,1)(0,2)
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr1[i][j]);
            }

        }
    }
}
