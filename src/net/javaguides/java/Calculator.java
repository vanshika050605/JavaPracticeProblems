package net.javaguides.java;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 = SUM");
        System.out.println("2 = SUB");
        System.out.println("3 = MUL");
        System.out.println("4 = DIV");
        System.out.println("Enter the number for operation");
        int operation =sc.nextInt();
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        int b=sc.nextInt();


        switch(operation){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;


            
            

        }
        sc.close();
        
    }
}
