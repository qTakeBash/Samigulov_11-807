package ClassTest01;

import java.util.Scanner;
// Вариант 2
public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
       static int[]  getSideDiagonalAsVector = new int[n];
        for (int i = 1; i < n; i++) {
            getSideDiagonalAsVector[i-1] = matrix1[i][n+1-i];
        }
        System.out.println(getSideDiagonalAsVector[n] + " ");

    }


    }
}

