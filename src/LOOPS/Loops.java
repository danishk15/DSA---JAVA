package LOOPS;

import java.util.Scanner;

class Fibonacci {
    static void main() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a =0;
        int b =1;
        int count =2;

        while (count>num){
            int temp =b;
            b=b+a;
            b=temp;
            count++;
        }
        System.out.println(a);
    }
}
