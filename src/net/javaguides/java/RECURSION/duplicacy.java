package net.javaguides.java.RECURSION;

public class duplicacy {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicacy(int idx,String str,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char ch=str.charAt(idx);
        if(map[ch - 'a'] == true){
            removeDuplicacy(idx+1, str, newStr);
        }
        else{
            newStr += ch;
            map[ch - 'a'] = true;
            removeDuplicacy(idx+1, str, newStr);

        }
    }
    public static void main(String[] args) {
        removeDuplicacy(0, "aabccdb", " ");
    }
}
