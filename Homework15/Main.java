package com.company.Homework15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextAnalyzer a = new JaccardTextAnalyzer();
        TextAnalyzer b = new CosineTextAnalyzer();
        System.out.println("Ввод текста: с клавиатуры (0) из файла(1)? Введите: 0/1");
        int way1 = sc.nextInt();
        sc.nextLine();
        if (way1 == 0) {
            System.out.println("Введите текст №1");
            String s1 = sc.nextLine();
            System.out.println("Введите текст №2");
            String s2 = sc.nextLine();
            double coef1 = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
            double coefCos1 = b.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
            System.out.println("Выбор Метода: Жаккард(1)/Косинус(0)?");
            int way2= sc.nextInt();
            sc.nextLine();
            if (way2 == 1) {
                System.out.println("Жаккард для просто строк: " + coef1);
            }
            else {

                System.out.println("Косинусная мера для просто строк: " + coefCos1);
            }

        }
        else {
            System.out.println("Жакард(0)/Косинус(1)");
            int way3 = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите путь к файлу №1");
            File f1 = new File(sc.nextLine());
            System.out.println("Введите путь к файлу №2");
            File f2 = new File(sc.nextLine());
            if (way3 == 1) {
                double coef2 = a.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
                System.out.println("Жаккард для содержимого файлов: " + coef2);
            }
            else {
                double coefCos2 = b.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
                System.out.println("Косинусная мера для просто строк: " + coefCos2);
            }
        }
        System.out.println("Введите поисковый запрос");
        String search = sc.nextLine();
        TextProvider tp = new SimpleTextProvider(search);
        System.out.println("Введите каталог");
        String dirWay = sc.next();
        GetTextProviderList getTextProviderList = new GetTextProviderList(dirWay);
        SearchEngine searchEngine2 = new SearchEngine2();
        searchEngine2.getSortedByRelevanceList(tp, getTextProviderList.List());
    }
}