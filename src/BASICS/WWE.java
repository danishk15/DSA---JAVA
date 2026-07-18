package BASICS;

public class WWE{
    static void main(String[] args) {
        int temp =0;
        int n=675854;
        while(n>0){
            int rem=n%10;
            n/=10 ;
            temp=temp*10+rem;
        }
        System.out.println(temp);
    }
}