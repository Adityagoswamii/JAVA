import java.util.Scanner;
  class Greatest
   {
     public static void main(String[]args)
   {
     int a,b;
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the first number:");
       a=sc.nextInt();
       System.out.print("enter the second number:");
       b=sc.nextInt();
   if(a>b)
   {
      System.out.print("The Greater number =" +a);
   }
   else if(b>a)
   {
      System.out.print("The Greater number =" +b);
   }
	else
   {
      System.out.print("both are equal");	
    }
   } 
 }