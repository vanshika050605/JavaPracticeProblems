package net.javaguides.java;
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width of pattern");
        int n=sc.nextInt();
        System.out.println("Enter height of pattern");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){

            for(int j=1;j<=n;j++){
                System.out.print("* "); 
            }
            System.out.println();
        }
        sc.close();

    }

    
}
