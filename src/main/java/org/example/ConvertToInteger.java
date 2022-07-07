package org.example;

import java.util.Arrays;

public class ConvertToInteger {
    int[] arr;
    int valueToAdd;

    public ConvertToInteger(int[] arr, int valueToAdd) {
        this.arr = arr;
        this.valueToAdd = valueToAdd;
    }


    public int convertInputArrToInteger() {
        int result = 0;
        int length = arr.length - 1;

        for (int i = 0; i <= length; i++) {
            int digit = arr[i] - '0';
            result *= 10;
            result += digit;
        }
        result += valueToAdd;

        return result;

    }

    public int[] convertToArrayOutput() {
        int numberToCount = convertInputArrToInteger();
        int countNumbers = 1;
        int numberToConvert = convertInputArrToInteger();

        while (numberToCount >= 10) {
            numberToCount = numberToCount / 10;
            countNumbers++;
        }

        int[] arrOutput = new int[countNumbers];
        int firstDigit = numberToConvert % 10;
        arrOutput[countNumbers -1] = (firstDigit);

        for (int i = countNumbers - 2; i >= 0; i--) {

            numberToConvert = numberToConvert / 10;
            arrOutput[i] = numberToConvert % 10;

        }
             //   System.out.println(Arrays.toString(arrOutput));


        return arrOutput;
    }


}

