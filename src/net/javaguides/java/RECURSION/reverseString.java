package net.javaguides.java.RECURSION;

public class reverseString {
    public static void stringR(String s,int n){
        if(n==0){

            return;
        }
        char s1=s.charAt(n-1);
        System.out.print(s1);
        stringR(s, n-1);
        
    }
public static void main(String[] args) {
    String s2="abcd";
    int m=s2.length();
     
    stringR(s2,m);
}
    
}
