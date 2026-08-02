package net.javaguides.java;

import java.util.Scanner;

public class Voting {
    public static boolean eligible(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }}
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();
            System.out.println(eligible( age));

            sc.close();
        
    }   
}
