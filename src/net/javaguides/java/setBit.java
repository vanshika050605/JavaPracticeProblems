package net.javaguides.java;

public class setBit {
    public static void main(String[] args) {
        int num=5;
        int pos=3;
        int bitMask=1<<pos;
        int set=(bitMask | num);

        System.out.println("Number after set bit is :"+  set);
    }
    
}
