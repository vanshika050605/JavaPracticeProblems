package net.javaguides.java;

import java.util.Scanner;

public class CIrcumference {
    public static double circumferneceOfCircle(int r){
        double cir;
         cir =2 * 3.14 * (r);
         return cir;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println(circumferneceOfCircle(r));
        sc.close();
    }
    
}
