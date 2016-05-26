/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.first.Simpleapp;
import java.util.Scanner;
import com.first.Simpleapp.util.calculator;
/**
 *
 * @author Prince
 */
public class program {

   
    
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            calculator calc=new calculator();
            while (true){
    //order
       System.out.print("enter value of x:");
       double x= input.nextDouble();
       System.out.print("enter value of y:");
       double y= input.nextDouble();
      
       //menu
       System.out.println("1. Add");
       System.out.println("2. Subtract");
       System.out.println("3. Multiply");
       System.out.println("4. Divide");
       System.out.println("5. Power");
       System.out.println("6. Maximum value");
       System.out.println("7. MInimum value");
       System.out.println("8. Exit");
       System.out.println("Enter your choice (1-8)");
       
       double total=0;
       switch (input.nextInt()){
        case 1:
            total=calc.add(x,y);
         break;
        case 2:
            total=calc.sub(x,y);
         break;
        case 3:
            total=calc.mul(x, y);
         break;
        case 4:
            total=calc.div(x, y);
         break;
        case 5:
            total=calc.pow(x, y);
         break;
        case 6:
            total=calc.max(x, y);
        break;
        case 7:
            total=calc.min(x, y);
         break;
        case 8:
         System.exit(0);
               
        
    }
       
       System.out.println("Required value:"+ total);
       System.out.println("Do you want to continue[y/N]");
     
      
       if(input.next().equalsIgnoreCase("n"))
           System.exit(1);
                   
            }
    }
    
}
