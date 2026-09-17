package net.javaguides.java.RECURSION;

public class towerOfHanoi {
    public static void  transfer(int n,String src,String helper ,String dest)
    {
        if(n==1){
            System.out.println("Transfer disk " +n +" From "+src +" to"+ dest);
            return;
        }
       transfer(n-1, src, dest, helper);
        System.out.println("Transfer disk " +n +" From "+src +" to "+ dest);
        transfer(n-1, helper, src, dest);

     
        }
        public static void main(String[] args) {
            int n =7;
            transfer(n,"S","H","D");
        }
    }