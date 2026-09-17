package net.javaguides.java.HackersRank;
import java.util.*;

public class outputFormatting {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       String s1=sc.next();
       int x=sc.nextInt();
       System.out.printf(s1);
       for(int i=s1.length()+1;i<=16;i++){
        System.out.print("  ");
       }
       if(x<10){
        System.out.print("00"+x);
       }
       else if(x<100){

        System.out.print("0"+x);}
        else if(x<1000){
            System.out.print(x);
        }
        else{
            System.out.print("Invalid");
        }
        sc.close();

    }
    
}
