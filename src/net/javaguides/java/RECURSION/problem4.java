package net.javaguides.java.RECURSION;

public class problem4 {
    public static int  power(int n,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;

        }
        int xpower_nm1= power(n-1,x);
        int xpower=x * xpower_nm1;
        return xpower;
        }
        public static void main(String[] args) {
            int ans=power(5,2);
            System.out.println(ans);
        }
    }