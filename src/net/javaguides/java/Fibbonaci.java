package net.javaguides.java;

import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=0;
        int m=1;
        for(int i=0;i<=a/2;i++){
            System.out.println(n);
            System.out.println(m);
            n=n+m;
            m=n+m;
        }
        sc.close();
    }
}
