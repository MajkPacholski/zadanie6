package org.example;

public class ConvertToInteger {
    int[] arr;
    int valueToAdd;

    public ConvertToInteger(int[] arr, int valueToAdd) {
        this.arr = arr;
        this.valueToAdd = valueToAdd;
    }

    //konwertowanie tablicy do liczby i dodanie liczby

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

    //liczenie ilości cyfr
    public int countArrayLength() {
      int countNumbers = 1;
      int numberToCount = convertInputArrToInteger();
        while (numberToCount >= 10) {
            numberToCount = numberToCount / 10;
            countNumbers++;
        }
        return  countNumbers;
    }
//tworzenie nowej tablicy
        public int [] makeNewOutputArray() {
        int countNumbers = countArrayLength();
        int numberToConvert = convertInputArrToInteger();
        int[] arrOutput = new int[countNumbers];
        int firstDigit = numberToConvert % 10;
        arrOutput[countNumbers - 1] = (firstDigit);
        for (int i = countNumbers - 2; i >= 0; i--) {
            numberToConvert = numberToConvert / 10;
            arrOutput[i] = numberToConvert % 10;
        }
        return arrOutput;
    }
}

