import org.example.ConvertToInteger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestConvertToInteger {
    @Test
    public void ConvertToIntegerTest() {
        int[] arr = {'2', '3', '4', '5'};
        int  valueToAdd = 1;
        ConvertToInteger test = new ConvertToInteger(arr, valueToAdd);
        Assert.assertEquals(2346, test.convertInputArrToInteger());
    }

    @Test
    public void countingInputArrayDigit() {
        int[] arr = {'2', '3', '4'};
        int  valueToAdd = 1;
        ConvertToInteger test = new ConvertToInteger(arr, valueToAdd);
        Assert.assertEquals(3, test.countArrayLength());
    }

    @Test
    public void outputArrayAfterConvertTest() {
        int[] arr = {'2','3','4'};
        int[] arr2 = {2,3,5};
        int  valueToAdd = 1;
        ConvertToInteger test = new ConvertToInteger(arr, valueToAdd);
        Assert.assertEquals(Arrays.toString(arr2),Arrays.toString(test.makeNewOutputArray()));

    }
}
