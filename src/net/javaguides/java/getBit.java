package net.javaguides.java;


public class getBit {

    public static void main(String args[]){
        int num=5;
        int pos=3;
        int bitMask= 1<<pos;

        int get=(bitMask & num);

        if(get==0){
            System.out.println("The bit is 0");
        }
        else{
            System.out.println("The bit is 1");

        }
    }


}
