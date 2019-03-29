package employee.codejava;
import java.util.Scanner;

import static java.time.Clock.system;
public class day extends employee 

  { 
     double bonus;
     void da()
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter worked days");
       day= input.nextInt();
       System.out.println("Enter daysalary");
       salary= input.nextInt();
       
       if(day>5)   
       {
       grosssalary= day*salary;
       bonus= grosssalary*12/100;
       netsalary= (int) (grosssalary+bonus);
       }
       
       else
    	   
       {
       grosssalary= day*salary;
       netsalary= grosssalary;
       }
          
           System.out.println("the employee bonus is:");
           System.out.println(bonus);
           System.out.println("the employee gross salary is:");
           System.out.println(grosssalary);
           System.out.println("the employee net salary is:");
           System.out.println(netsalary);

       } 
   }
