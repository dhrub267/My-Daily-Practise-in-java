//Day Befor N day
import java.util.Scanner;

public class Day_Befor_N_day {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the day");
      int d=sc.nextInt();
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int x=n%7;
      int ans=d-x;
      if(ans<0){
       int  ans1=ans+7;
        System.out.println(ans1);

        if(ans1==0){
        System.out.println("Sunday");
      }
      if(ans1==1){
        System.out.println("Monday");
      }
      if(ans
      1==2){
        System.out.println("Tuesday");
      }
      if(ans1==3){
        System.out.println("Wednesday");
      }
      if(ans1==4){
        System.out.println("Thursday");
      }
      if(ans1==5){
        System.out.println("Friday");
      }
      if(ans1==6)
      {
        System.out.println("Suturday");
      }
      }
      else{
    System.out.println(ans);
      }
     
      if(ans==0){
        System.out.println("Sunday");
      }
      if(ans==1){
        System.out.println("Monday");
      }
      if(ans==2){
        System.out.println("Tuesday");
      }
      if(ans==3){
        System.out.println("Wednesday");
      }
      if(ans==4){
        System.out.println("Thursday");
      }
      if(ans==5){
        System.out.println("Friday");
      }
      if(ans==61
      ){
        System.out.println("Suturday");
      }
    }
    
}
