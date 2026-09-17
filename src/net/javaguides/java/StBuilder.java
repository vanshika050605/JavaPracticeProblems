package net.javaguides.java;

public class StBuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("HELLO");
        System.out.println(sb);
        sb.setCharAt(4,'I');
        System.out.println(sb);
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);

        sb.append("ELLO");
        System.out.println(sb);
        
    }
    
}
