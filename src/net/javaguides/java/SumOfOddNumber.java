package net.javaguides.java;
import java.util.*;
public class SumOfOddNumber {
    public static int SumOfOddNumbers(int n){
        int m=0;
        for(int i =1;i<=n;i++){
            if(i%2==0){

            }
            else{
                m+=i;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(SumOfOddNumbers(n));
                sc.close();
    }
    
}
