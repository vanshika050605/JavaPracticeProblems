package net.javaguides.java;

public class prePost {
    public static void main(String[] args) {
        int a=2;
        int b=0;

        b=a++;
        System.out.println(a);
        System.out.println(b);

        b=++a;
        System.out.println(a);
        System.out.println(b);
    }
}
