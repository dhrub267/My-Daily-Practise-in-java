// public class Operator1 {
//     public static void main(String[] args) {
//         int x=10, y=20 ;
//         //Post fix
//         //It first  print and update
//         System.out.println(x++);
//         System.out.println(x--);
//         //prefix
//         //It first update then print
//         System.out.println(++x);
//         System.out.println(--x);

    
//     }
// }


//Assignment Operator(=, +=, -=, *=, /=, %=)
public class Operator1 {
    public static void main(String[] args) {
        int x=10, y=5, z=3;
        x+=y;  //x=x+y;
        System.out.println(x);

        x-=y; //x=x-y
        System.out.println(x);

        x/=y; //x=x-y
        System.out.println(x);


        x*=y; //x=x-y
        System.out.println(x);

        x%=y; //x=x-y
        System.out.println(x);

z=x=y;//right to left precndent
System.out.println(z);
    
    }
}











