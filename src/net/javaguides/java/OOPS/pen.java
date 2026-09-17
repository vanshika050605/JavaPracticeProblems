package net.javaguides.java.OOPS;


class Design{

    String colour;
    String type;

    public void write()
{
    System.out.println("This is my new pen");
}
     public void printColour(){
        System.out.println(this.colour);
     }
     public void printType(){
        System.out.println(this.type);
     }



}

public class pen {
    public static void main(String args[]){
        Design pen1= new Design();
        pen1.colour="Black";
        pen1.type="Ballpoint";
        Design pen2= new Design();
        pen2.colour="Blue";
        pen2.type="gel";

        pen1.write();
        System.out.println("with colour "+pen1.colour+" and type "+pen1.type);

        pen1.printColour();
        pen2.printColour();

        pen1.printType();
        pen2.printType();
    }

    
}
