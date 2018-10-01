package com.company;

import java.util.Scanner;

public class Lokmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        int a = 0;
        for (int i = 1; i < n-1 ; i++) {
            if (m[i]>m[i-1] && m[i]>m[i+1]) {
                a++;
            }
        }
        System.out.println(a);
    }
}