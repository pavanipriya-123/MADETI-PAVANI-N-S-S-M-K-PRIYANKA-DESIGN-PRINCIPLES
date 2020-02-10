import java.util.*;
import java.io.*;
class Cal{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Operand :");
        double a=sc.nextDouble();
         System.out.println("Enter Second Operand :");
        Double b=sc.nextDouble();
         System.out.println("Enter Operator :");
         String operator=sc.next();
         if(operator.equals("+"))
         {
             Addition add=new Addition(a,b);
             System.out.println(add.addtwonumbers(a,b));
         }
         else  if(operator.equals("-"))
         {
             Subtraction sub=new Subtraction(a,b);
             System.out.println(sub.subtwonumbers(a,b));
         }
         else  if(operator.equals("*"))
         {
            Multiplication mul=new Multiplication(a,b);
             System.out.println(mul.multwonumbers(a,b));
         }
          else  if(operator.equals("/"))
         {
            Division div=new Division(a,b);
            if(b==0)
            System.out.println("Can't divide by 0");
            else if(a==0)
            System.out.println("0");
            else 
             System.out.println(div.divtwonumbers(a,b));
         }
         else
         System.out.println("No such option is available in our calculator");
    }

}