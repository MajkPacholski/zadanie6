package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {'2', '3', '4', '5'};
        int  valueToAdd = 1;

        ConvertToInteger convert = new ConvertToInteger(arr, valueToAdd);

        System.out.println(Arrays.toString(convert.makeNewOutputArray()));

    }
}

