//Characteristics of non primitives types varible
// 1. Non primitive type are alwys refrences 
class Nonprimitive1 {
    int x, y;
}

public class args {
    public static void main(String args[]) {
        Nonprimitive1 p1 = new Nonprimitive1();
        p1.x = 20;
        p1.y = 200;

        //Nonprimitive1 p2 = new Nonprimitive1();

        // Assigning p2 to p1: now both p1 and p2 point to the same object
    //  Nonprimitive1 p2 = new Nonprimitive1();
      //p1=p2;
        Nonprimitive1 p2=p1;//We can write like this also

        p2.x = 500;

        System.out.println("value of x in p1= " + p1.x);
        System.out.println("Value of x in p2 " + p2.x);
        System.out.println("Value of x in p2 " + p2.y);
    }
}


