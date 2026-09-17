package net.javaguides.java.RECURSION;

public class movement {
    public static void moveallx(int idx,String s,int count,String newStr ){
        if(idx==s.length()){
            for(int i=1;i<=count;i++){
            newStr += 'x';
         }
            System.out.println(newStr);
            return;
        }
         char s1=s.charAt(idx);
         if(s1=='x'){
              count++;
              moveallx(idx+1, s, count,newStr);
         }
         else{
            newStr += s1;
            moveallx(idx+1, s, count,newStr);
         }
         
    }
    public static void main(String[] args) {
        moveallx(0, "abxxjuwxxe", 0, " ");
    }
}
