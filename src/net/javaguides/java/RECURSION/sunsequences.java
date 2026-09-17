package net.javaguides.java.RECURSION;

public class sunsequences {
    public static void sub(String str, int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char ch=str.charAt(idx);

        sub(str, idx+1, newstr+ch);
        


        sub(str, idx+1, newstr);
        
    }
    public static void main(String[] args) {
        String str="abc";
        sub(str,0,"");
    }
    
}
