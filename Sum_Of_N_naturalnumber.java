import java.util.Scanner;
public class Sum_Of_N_naturalnumber {
 
    public static void main(String[] args) {
    int s=0;  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the natural number");
    int n=sc.nextInt();
      for(int i=0;i<n;i++) {
        s=s+i;
      // System.out.println("Sum of N natural Numer is"+s);
      }
System.out.println("Sum of N natural Numer is "+s);
    }
    
}
