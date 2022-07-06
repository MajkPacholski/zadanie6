package org.example;



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

    public void   convertToArrayOutput() {


        

    }


}

