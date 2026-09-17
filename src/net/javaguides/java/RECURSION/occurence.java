package net.javaguides.java.RECURSION;

public class occurence {
    public static int first=-1;
    public static int last=-1;
    public static void occur(String str,char element ,int idx){
        
    if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
    }
    char currentChar=str.charAt(idx);
    if(currentChar==element){
        if(first== -1){
            first=idx;
        }
        else{
            last=idx;
        }

    }
    occur(str, element, idx+1);

    }

    
    public static void main(String[] args) {
        occur("aaassasnuchudhcaasdjiacd", 'h', 0);
        
    }
    
}
