
//Test wheather the given input is positve even, positive evem,
//negative odd,negative odd
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n>0 && n%2==0){
            System.out.println("It is positive even number");
        }

        else if(n>0 && n%2 !=0){
            System.out.println("It is positive odd numbner");
        }
else if(n<0 && n%2==0){
    System.out.println("it is negative even number");
}

else if(n<0 && n%2!=0){
    System.out.println("It is negative odd number");
}

else{
    System.out.println("it is zero");
}
        
    }
    
}
