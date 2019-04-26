package com.company;

import com.company.Task02.ByCameraSmartPhoneComparator;
import com.company.Task02.SmartPhone;
import com.company.Task03.Reader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static void task2() {
        Comparator<SmartPhone> CameraSmartPhone = new Comparator<SmartPhone>() {
            @Override
            public int compare(SmartPhone o1, SmartPhone o2) {
                return Integer.compare(o1.getCameraMP(), o2.getCameraMP());
            }
        };
        ArrayList<SmartPhone> smartPhones = new ArrayList<>();
        smartPhones.add(new SmartPhone(16, 3000, "samsung"));
        smartPhones.add(new SmartPhone(12, 3200, "sony"));
        smartPhones.add(new SmartPhone(25, 2400, "nokia"));
        smartPhones.add(new SmartPhone(15, 1200, "apple"));
        Collections.sort(smartPhones, CameraSmartPhone);
        for (SmartPhone l1 :
                smartPhones) {
            System.out.println(l1.toString());
        }
        ByCameraSmartPhoneComparator cam = new ByCameraSmartPhoneComparator();
        for (SmartPhone l1 :
                smartPhones) {
            for (SmartPhone l2 :
                    smartPhones) {
                cam.compare(l1, l2);
            }
        }
        for (SmartPhone l1 :
                smartPhones) {
            System.out.println(l1.toString());
        }
    }
    public static void task3() {
        Reader tr = new Reader();
        tr.start();
    }
    public static void main(String[] args) {
    task2();
    task3();
    }
}
