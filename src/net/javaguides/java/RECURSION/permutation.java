package net.javaguides.java.RECURSION;

public class permutation {
    public static void perm(String str,String permute){
        if(str.length()==0){
           System.out.println(permute);
           return;
        }


       for(int i=0;i<str.length();i++){
         char ch =str.charAt(i);
         String new_str=str.substring(0,i)+str.substring(i+1);
         perm(new_str, permute+ch);
         

       }
    }
    public  static void main(String[] args){
        String str="abc";
        perm(str, "");
    }
    
}
