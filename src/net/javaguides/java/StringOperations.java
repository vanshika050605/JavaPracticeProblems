package net.javaguides.java;
import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        //Concatenation
        String firstName =sc.next();
        String lastName=sc.next();
        String fullName= firstName + " " +lastName;
        System.out.println(fullName);

        //length
         System.out.println(fullName.length());

         //CharAt
          System.out.println(fullName.charAt(9));

          //Compare
          String name1="Vanshika";
          String name2="Vanshika";
           
          if(name1.compareTo(name2)==0){
            System.out.println("Strings are same ");

          }
          else{
            System.out.println("Not same");
          }
          if(name1==name2){
            System.out.println("Strings are same ");

          }
          else{
            System.out.println("Not same");
          }

          //SubString
          String sen="My Name is dash";
          String name =sen.substring(11,sen.length());
          System.out.println(name);



        sc.close();

    }
}
