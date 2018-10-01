package com.company;

import java.util.Scanner;

public class Lh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String m = "", a = "";
        for (int i = 0; i < n; i++) {
            m += sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
           a += sc.nextInt();
        }
        System.out.println(m.indexOf(a));

    }
}