package employee.codejava;
import static java.time.Clock.system;
import java.util.Scanner;

public class employee
{
    int netsalary;
    int grosssalary;
    int tax;
    int rssb;
    int hours;
    int salary;
    int day;
     
    public static void main(String[] args)
    
    {
    String name;  
    int id;
    int category;
    Scanner input = new Scanner(System.in);
    System.out.println("enter name");
    name = input.next();
    System.out.println("enter id");
    id = input.nextInt();
    System.out.println("enter 1 if she/he is a monthemployee and  2 if she/he is a dayemployee ");
    category = input.nextInt();
   
    if(category == 1)
       {
          month net = new month();
          net.monthly();
          
       }

       else if(category == 2)
        	
       {
           day net = new day();
           net.wee();
       }
      
}

   
}


