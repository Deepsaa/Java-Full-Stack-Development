package com;
/*Java program for Calculator.*/

import java.util.*;
 
public class Arithmeticcalculator{
 
     public static void main(String []args){
         int c,d,result;
         float res=0;
         /*scanner class object to read values*/
         Scanner input=new Scanner(System.in); 
          
         System.out.print("Enter first number: ");
         c=input.nextInt();
         System.out.print("Enter second number: ");
         d=input.nextInt();
          
         System.out.print("\n1: Addition.\n2: Subtraction.");
         System.out.print("\n3: Multiplication.\n4: Divide.");
         System.out.print("\n5: Remainder.\n6: Exit.");
          
         System.out.print("\nEnter your choice: ");
         result=input.nextInt();
          
         switch(result)
         {
             case 1:
                 res=(c+d); break;
             case 2:
                 res=(c-d); break;
             case 3:
                 res=(c*d); break;
             case 4:
                 res=(float)((float)c/(float)d); break;
             default:
                 System.out.println("An Invalid Choice!!!\n");
         }
         if(result>=1 && result<=4)
            System.out.println("Result is: " + res);
          
     }
}

