import java.util.Scanner;
// public class Patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         for(int i=1; i<=n;i++){
//             System.out.println("*");
//         }
//     }
// }

// output 
//Enter a number
// 5
// *
// *
// *
// *
// *

// public class Patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         for(int i=1; i<=n;i++){
//             System.out.print("*");
//         }
//     }
// }

// output:
// Enter a number
// 3
// ***

// public class Patterns{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         //int s=0;
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         int i=1;
//         while(i==1){
//             for(int j=0;j<n;j++){
//                System.out.println("*****");
//                i++;
//             }
            
//         }
//     }
// }

// output
// Enter a number
// 8
// *****
// *****
// *****
// *****
// *****
// *****
// *****
// *****



// public class Patterns
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         //int s=0;
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         int i=1;
//        for(i=1; i<=n;i++)
//        {
//          for(int j=1; j<=i;j++)
//           {
//             System.out.print("* ");
//           }
//           System.out.println();
//         }
//     }

// }   


// output:
// Enter a number
// 4 
// * *     
// * * *   
// * * * * 


// public class Patterns
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         //int s=0;
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//     int i;
//        for(i=n; i>=1;i--)
//        {
//          for(int j=1; j<=i;j++)
        
//           {
//             System.out.print("* ");
//           }
//           System.out.println();
//         }
//     }

// }   

// output
// Enter a number
// 8
// * * * * * * * * 
// * * * * * * *   
// * * * * * *     
// * * * * *       
// * * * *         
// * * * 
// * *   
// *   

// import java.util.Scanner;

// public class Patterns {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n = sc.nextInt();  // Input number from user

//         for (int i = 1; i <= n; i++) {
//             // Print spaces for right alignment
//             for (int k = 1; k <= n - i; k++) {
//                 System.out.print(" ");
//             }

//             // Print stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }


// class Solution {
//     public static void square(int s) {
//         for (int i = 1; i <= s; i++) {
//             for (int j = 1; j <= s; j++) {
//                 if (i == 1 || i == s || j == 1 || j == s) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  "); // two spaces for proper alignment
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// class Patterns{
//     public static void main(String[] args) {
//         Solution.square(5);
//     }
// }


// output
// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 

class Solution {
    public static void triangle(int s) {

        // Write your code here
        for(int i=1;i<=s;i++){
            for(int j=1;j<=i; j++){
            if(j==1 || j==i || i==s){
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
            }
            System.out.println();
        }
      //  System.out.println();
}
}

class Patterns{
    public static void main(String args[]){
        Solution.triangle(9);
    }
}

output
* 
* * 
*   * 
*     * 
*       *         
*         *       
*           *     
*             *   
* * * * * * * * * 




