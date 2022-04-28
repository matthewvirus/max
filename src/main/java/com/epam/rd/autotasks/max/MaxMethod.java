package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maxVal = values[0];
        for (int value : values) {
            if (maxVal < value) maxVal = value;
        }
        return maxVal;
    }
}
