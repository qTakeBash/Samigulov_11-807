package com.company.Task02;
import java.util.Comparator;

public class ByProccesorCapacityComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        if (o1.getProcessorCapacity() > (o2.getProcessorCapacity())) {
            return 1;
        } else if (o1.getProcessorCapacity() < (o2.getProcessorCapacity())) {
            return -1;
        } else return 0;
    }
}
