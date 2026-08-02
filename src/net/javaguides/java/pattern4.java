package net.javaguides.java;
import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the heigth of pattern");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                
                System.out.print(j);
                
            }
            System.out.println();
        }
      
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(j);
                
            }
            System.out.println();
        }
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                
                System.out.print(" ");
                
            }
             for(int j=1;j<=i;j++){
                
                System.out.print("*");
                
            }
            System.out.println();
        }*/
       int k=1;
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                     System.out.print("1");

                }
                else{
                System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
