package com.company.Lesson.hw4;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        StringBuffer sb = new StringBuffer(s);
        StringBuffer strResult = sb.delete(n1,n2 + 1);
        System.out.println(strResult);
    }
}