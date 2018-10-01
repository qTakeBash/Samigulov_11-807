package com.company;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int n = sc.nextInt();
        int max = 0;
        int m[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            if (Math.abs(m[i]) > max) {
                max = Math.abs(m[i]);
                k = i;
            }
        }
            System.out.println("Индекс максимкального по модулю элемента: " +k);
        }
    }