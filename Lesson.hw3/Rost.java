package com.company;

import java.util.Scanner;

public class Rost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = 0;
        double r = 0;
        System.out.println("Введите количество студентов:");
        int n = sc.nextInt();
        int s[] = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            r = r + s[i];
        }

        r = r / n;
        for (int i = 0; i < n; i++) {
            if (s[i]>r){
                k++;

            }

        }
        System.out.println("Средний рост: "+r);
        System.out.println("Количество студентов выше среднего роста: "+k);

    }
}