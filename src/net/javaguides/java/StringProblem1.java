package net.javaguides.java;

import java.util.Scanner;

public class StringProblem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names=new String[4];
        int l=0;
        for (int i=0;i<4;i++){
            names[i]=sc.next();
            l=l+names[i].length();
            
        }
        System.out.println(l);
    sc.close();
}
    
    }


