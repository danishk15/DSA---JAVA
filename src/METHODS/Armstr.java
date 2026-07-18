package METHODS;

import java.util.Scanner;

public class Armstr {
    static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(66));

    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;

        while (n>0){
            int res=n%10;
            n=n/10;
            sum=sum+res+res+res;
        }
        return sum==original;

    }
}
