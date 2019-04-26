package com.company.Task03;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Writer extends Thread {
    private String str;
    public Writer(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new
                    File("com/company/Files/out"), true));
            pw.println(getStr());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}