
//Last digit of a number
// import java.util.Scanner;
// public class LastdigitofNumber{
//     public static void main(String[] args) {
//     int s=0;  
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the number");
//     int n=sc.nextInt();
//     if(n<0){
//     int  Positive=Math.abs(n);
//     int  Ans=Positive%10;
// System.out.println(Ans);
//     }
//     else{
//     int Largest=n%10;
//     System.out.println("Largest Digit of Given number " +Largest);  
//     }
// }}

import java.util.Scanner;
public class LastdigitofNumber{
    public static void main(String[] args) {
    int s=0;  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int y=Math.abs(n);//for negative number
   int ans=y%10;
    System.out.println(y);
}}

