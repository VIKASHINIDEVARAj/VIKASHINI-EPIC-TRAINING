package TASKS;
import java.util.Scanner;

public class InverseMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] arr=new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]= sc.nextDouble();
            }
        }
        //determinant=(a*b)-(b*c)
        //1/det (d  -b)
        //      (-c  a)
        double deter=(arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0]);
        if (deter == 0) {
            System.out.println("inverse not possible");
        }
        else {
            double[][] inverse = new double[2][2];
            inverse[0][0]=arr[1][1]/deter;
            inverse[0][1]=arr[0][1]/deter;
            inverse[1][0]=arr[1][0]/deter;
            inverse[1][1]=arr[0][0]/deter;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(inverse[i][j]+" ");

                }
                System.out.println();
            }
        }
    }
}


//original matrix * inverse matrix =identity matrix