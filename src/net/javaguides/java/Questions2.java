package net.javaguides.java;

import java.util.Scanner;

public class Questions2 {
    public static void main(String[] args) {
         System.out.println("Enter x and n");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int n=sc.nextInt();
       int a=1;
       for(int i=1;i<=n;i++){
        a =a*x;
       }
       System.out.println(a);
       sc.close();
    }
    
}
