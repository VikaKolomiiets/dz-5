package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 22;
        int c = 13;
        int d = 21;
        int sum1 = a + b;
        int sum2 = c + d;
        System.out.println(sum1++ > sum2++);
        sum2++;
        System.out.println(sum1 > sum2);
        System.out.println(sum1%2 == 0 || sum2%2 == 0);
    }
}
