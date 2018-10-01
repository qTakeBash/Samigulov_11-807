package com.company;

import java.util.Scanner;

public class Reverse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        double c = n/2;
        for (int i = 0; i < c ; i++) {
            int k = 0;
            k = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = k;


        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }

    }
}
