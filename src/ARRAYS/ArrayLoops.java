package ARRAYS;

import java.util.Scanner;

public class ArrayLoops {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        {
            int i=0;
            while (i<arr.length) {
                arr[i] = in.nextInt();
                i++;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
 // not doing much code on basics of arrays...