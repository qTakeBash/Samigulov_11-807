package com.company.Task02;
import java.util.Comparator;

public class ByCameraSmartPhoneComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        if (o1.getCameraMP() > (o2.getCameraMP())) {
            return 1;
        } else if (o1.getCameraMP() < (o2.getCameraMP())) {
            return -1;
        } else return 0;
    }
}
