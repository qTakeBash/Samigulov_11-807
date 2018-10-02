package com.company.Lesson5;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        int d = s.length();
        for (int i = 0; i < d; i++) {
            if ( a[i] >= 48 && a[i] <= 57) {
                a[i] = '*';
            }
        }
        s = new String(a);
        System.out.println(s);
    }
}
