class Nonprimitive1{
    int x,y;
}

public class Nonprimitive{
    public static void main(String args[]){
        Nonprimitive1 p1=new Nonprimitive1();
        p1.x=20;
        p1.y=200;
        Nonprimitive1 p2= new Nonprimitive1();
       p1=p2;

       p2.x=500;
       System.out.println("value of x " + p1.x);
       System.out.println("Value of y" + p1. y);



    }
}