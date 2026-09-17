package net.javaguides.java.OOPS;

class Animal{
    public void walk(){
        System.out.println("Animal is walking"); //parent class method
    }


}

class horses extends Animal{//child class method(hierarchical inheritance)
    public void walk(){
        System.out.println("Horse walks on 4 legs"); 
    }

}

class Whitehorse extends horses{//child class method(multilevel inheritance)
    public void walk(){
        System.out.println("White horse walks on 4 legs");
    }
}

class Monkey extends Animal{//child class method(hierarchical inheritance)
    public void walk(){
        System.out.println("Monkey walks on 2 legs");
    }
}

public class inheritance {
    public static void main(String[] args){
        Animal a1=new Animal();
        a1.walk();

        horses h1=new horses();
        h1.walk();

        Monkey m1=new Monkey();
        m1.walk();

        Whitehorse w1=new Whitehorse();
        w1.walk();
    }
    
}
