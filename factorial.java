import java.util.Scanner;
  class Factorial
   {
     public static void main(String[]args)
   {
     int n,f=1;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter a number:");
	  n=sc.nextInt();
	  while (n>=1)
   {
      f=f*n;
      n--;
   }
     System.out.print("factorial="+f);
   }
 }