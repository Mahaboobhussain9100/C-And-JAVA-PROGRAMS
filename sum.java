import java.util.Scanner;
class sum
{
  /**
   * @param args
   */
  public static void main(String args[])
  {
   int a,b,sum;
   try ( Scanner  = new Scanner(System.in)) 
   {
    System.out.println("Enter A Value:");
     Scanner input;
    a=input.nextInt();
     System.out.println("Enter B Value:");
     b=input.nextInt();
  }
   sum=a+b;
   System.out.println("Sum of A&B:" + sum);
   }
}