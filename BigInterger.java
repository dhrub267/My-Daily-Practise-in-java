// import java.math.BigInteger; // Import BigInteger class

// public class BigInterger {
//     public static void main(String[] args) {
//         String s = "123456";
//         BigInteger S = new BigInteger(s); // Correct spelling and usage
//         System.out.println("BigInteger value: " + S);
//     }
// }

//INITILIZATION IO BigInterger

// import java.math.BigInteger;

// public class BigIntegerExample {
//     public static void main(String[] args) {
//         BigInteger A = BigInteger.valueOf(30); // convert int to BigInteger
//         BigInteger B = BigInteger.valueOf(20);

//         BigInteger C = A.add(B); // A + B

//         System.out.println("Sum = " + C); // Output: Sum = 50
//     }
// }
// import java.math.BigInteger;
// import java.util.Scanner;

// public class BigInterger {
//     public static void main(String[] args) {
//         System.out.println("Enter the number:");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         BigInteger result = factorial(a);
//         System.out.println("Factorial of " + a + " is: " + result);
//     }

//     public static BigInteger factorial(int n) {
//         BigInteger fact = new BigInteger("1");

//         for (int i = 2; i <= n; i++) {
//             fact = fact.multiply(BigInteger.valueOf(i));
//         }

//         return fact;
//     }
// }

import java.math.BigInteger;
import java.util.Scanner;

public class BigInterger {  // Your custom class name is fine here
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        BigInteger fact = new BigInteger("1");  // ✅ Correct spelling

        for (int i = 1; i <= a; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + a + " is: " + fact);
    }
}
