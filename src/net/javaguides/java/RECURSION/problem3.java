package net.javaguides.java.RECURSION;

public class problem3 {
    public static void fact(int n ,int a,int i){
        if(n==i){
            System.out.println(a);
            return;}

            a=n*a;
            fact(n-1,a,i);
        }
        public static void main(String[] args) {
            fact(5, 1, 1);
        }
    }

