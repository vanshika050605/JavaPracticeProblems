package net.javaguides.java.OOPS;

class Student1{
    int age;
    String name;

    public void write(){
        System.out.println("this is data");
    }

    public void write(int age){
        System.out.println("this is my age"+this.age);
    }

    public void write(String name){
        System.out.println("this is my name"+this.name);
    }
}

public class polymorhism {
    public static void main(String[] args){
    Student1 s1=new Student1();
    s1.name="gourav";
    s1.age=23;
    s1.write();
}}
