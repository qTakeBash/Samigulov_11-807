package com.company;

import java.util.Scanner;

public class Mass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        String s = new String();
        for (int i = 0; i < n; i++) {
            s = s + m[i];
        }
        System.out.println(s);
    }
}
