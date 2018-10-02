package com.company.Lesson5;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n == 1) {
            double a = sc.nextDouble();
            double s = 0;
            String op = sc.next();
            double b = sc.nextDouble();
            if (op.equals("+")) {
                s = a + b;
            } else {
                if (op.equals("*")) {
                    s = a * b;
                } else {
                    if (op.equals("/")) {
                        s = a / b;
                    } else {
                        if (op.equals("-"))
                            s = a - b;
                    }
                }
                System.out.println(+s);
                System.out.println("Сбросить результат? y/n");
                String k = sc.nextLine();
                if (k.equals('y')) {
                    n = 1;
                } else if (k.equals('n')) {
                    n = 0;
                }
            }
        }
    }
}
