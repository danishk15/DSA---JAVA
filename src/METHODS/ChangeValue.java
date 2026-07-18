package METHODS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    static void main(String[] args) {
        // create an array
        int[] arr={1,5,7,9};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]=99;
    }
}
