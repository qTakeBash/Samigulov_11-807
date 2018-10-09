package ClassTest01;

import java.util.Scanner;

public class ClassTestTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = s.charAt(0) - 48;
        for (int i = 1; i < s.length(); i = i + 2) {
            switch (s.charAt(i)) {
                case '-':
                    res -= s.charAt(i + 1) - 48;
                    break;
                case '+':
                    res += s.charAt(i + 1) - 48;
                    break;
            }
        }
        System.out.println(res);
    }
}

