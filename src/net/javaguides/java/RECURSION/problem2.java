package net.javaguides.java.RECURSION;

public class problem2 {
    public static void fib(int a ,int b,int n){
        if(n==0){
            
            return;
        }
        int c=a+b;
        System.out.println(c);
        fib(b,c,n-1);


    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        fib(0,1,n-2);
    }
}
   

