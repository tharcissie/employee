package employee.codejava;
import java.util.Scanner;
import static java.time.Clock.system;

public class month extends employee
{
    void monthly()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the salary");
        grosssalary = input.nextInt();
        tax = grosssalary*25/100;
        rssb = grosssalary*5/100;
        netsalary=grosssalary-tax-rssb;
        System.out.println("the monthly employee  salary details:\n");
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("the employee tax is:\n");
        System.out.println(tax);
        System.out.println("the employee RSSB is:\n");
        System.out.println(rssb);
        System.out.println("the employee gross salary is:\n");
        System.out.println(grosssalary);
        System.out.println("the employee net salary is:\n");
        System.out.println(netsalary);
      }
    }



