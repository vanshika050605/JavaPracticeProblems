package net.javaguides.java;

public class clearBit {
    public static void main(String[] args) {
        int num=7;
        int pos=2;
        int bitMask=1<<pos;
        int NotBitMask = (~(bitMask));
        int cleared=(num & NotBitMask);
        System.out.println(cleared);

    }
    
}
