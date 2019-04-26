package com.company.Task03;
import java.util.Scanner;

public class Reader extends Thread{

    @Override
    public void run() {
        Scanner scanner = new Scanner("C:\\111\\ProgressCheck\\src\\com\\company\\Files\\text1");
        while(scanner.hasNextLine() ){
            Writer tw = new Writer(scanner.nextLine());
            tw.start();
        }
    }
}