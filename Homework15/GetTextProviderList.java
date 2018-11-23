package com.company.Homework15;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetTextProviderList implements getList {
    private String dirWay;

    public GetTextProviderList(String dirWay) {
        this.dirWay = dirWay;
    }


    @Override
    public List<TextProvider> List() {
        File dir = new File(dirWay);
        List<File> files = FileList(dir);
        List<TextProvider> tpList = TextProviderList(files);
        return tpList;
    }

    public List<File> FileList(File dir) {
        List<File> list = new ArrayList<>();
        for (File item : dir.listFiles()) {
            if (item.isDirectory()) {
                FileList(item);
            } else {
                list.add(item);
            }
        }
        return list;
    }

    static List<TextProvider> TextProviderList(List<File> files) {
        List<TextProvider> list = new ArrayList<>();
        for (File item : files)
            list.add(new FileTextProvider(item));
        return list;
    }
}