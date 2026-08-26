package Pattern;
public class P1 {
    public static void main(String[] args) {
        Pattern6(5);
    }

    static void Pattern1(int n) {
        for (int i = 1; i <= n; i++) {// column

            for (int j = 1; j <= n; j++) { //prints star
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern4(int n) {  //half pyramid
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void Pattern6(int n) {        // full pyramid
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void Pattern5(int n) {
        //hollow butterfly
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 2) - 1; j++) {
                if (j == i || (i + j) == (n * 2) - 2 || j == (n * 2) - 2 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < (n * 2) - 1; j++) {
                if (j == i || (i + j) == (n * 2) - 2 || j == (n * 2) - 2 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void Pattern7(int n) {        // 123 in vertical
        for (int i = 1; i <= n; i++) {
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count = count + ( n - j );
            }
            System.out.println();
        }
    }

    static void Pattern8(int n){
        // sand clock       12345 2345 345 45 5
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");  //space
            }
            for (int j = i; j <=n; j++) {
                System.out.print(" "+ j); //idhu top
            }
            System.out.println();
        }
        for (int i = 1; i <n; i++) {
            for (int j = n-i-1; j > 0; j++) {
                System.out.print(" ");  //space
            }
            for (int j = n-i; j <=n; j++) {
                System.out.println(" "+j);    // idhu kella
            }
            System.out.println();
        }

    }
    static void Pattern9(int n){
        // sand clock 12345 1234 123 12 1
        for (int i = 0; i <=(n/2); i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");  //space
            }
            for (int j = i; j <=n; j++) {
                System.out.print(j-1+" "); //idhu top
            }
            System.out.println();
        }
        for (int i = (n/2)-1; i >=0; i++) {
            for (int j = 0; j<= i; j--) {
                System.out.print(" ");  //space
            }
            for (int j = 0; j <=(n-(i*2)); j++) {
                System.out.print("* ");    // idhu kella
            }
            System.out.println();
        }

    }

}
