package net.javaguides;

import java.util.*;

public class Function {
    public static int sumOfTwoNumber(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int mulOfTwoNumber(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sumOfTwoNumber(a, b));
        System.out.println(mulOfTwoNumber(a, b));
        sc.close();

    }
}
