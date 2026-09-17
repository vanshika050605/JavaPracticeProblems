package net.javaguides.java.OOPS;

abstract class Car{//abstract class
    String brand;
    int model_no;
    public void printInfo(){
        System.out.println("car created");
    }
}

class Audi extends Car{
    public void printInfo(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Model No: "+this.model_no);
    }
}

class BMW extends Car{
    public void printInfo(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Model No: "+this.model_no);
    }
}

public class abstraction {
    public static void main(String[] args){
       
        Audi a1=new Audi();
        a1.brand="Audi";
        a1.model_no=2023;
        a1.printInfo();

        BMW b1=new BMW();
        b1.brand="BMW";
        b1.model_no=2024;
        b1.printInfo();
    }
    
}
