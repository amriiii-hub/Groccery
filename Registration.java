/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author DELL
 */
class Register
{

    public static String firstname;
    public static String pwd;
    private static String email;
    public static String pass1;
    public static long phn;
    public static void Register()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("          REGISTRATION");
        System.out.println("-------------------------------");
        System.out.println("Enter your first name => ");
        firstname=sc.nextLine();
        System.out.println("Enter your last name => ");
       String lastname=sc.nextLine();
        System.out.println("Enter your emailId => ");
        email=sc.nextLine();
        System.out.println("Enter your Mobile number => ");
        long mob=sc.nextLong();
        phn=mob%1000;
        
        pass1=Long.toString(phn);
        pwd=lastname.concat(pass1);
        System.out.println("You have Registered Successfully!!!");
        System.out.println("You can Login either via Password or via OTP");
          System.out.println("-----------------------------");
          System.out.println("Press 1 to login via OTP");
          System.out.println("Press 2 to login via Password");
          System.out.println("-----------------------------");
        int ch;
        ch=sc.nextInt();
        if(ch==1)
        {
           OTP(); 
        }
        else if(ch==2)
        {
           Pass();
        }
    }
    
        public static void OTP()
        {  
        System.out.println("-------------------------------");
        System.out.println("Your username is => "+firstname);
        System.out.println("Your OTP is => "+phn);
        System.out.println("-------------------------------");
        Login r=new Login();
        r.Login(firstname,phn);
        
        }
        public static void Pass()
        {
        System.out.println("-------------------------------");
        System.out.println("Your username is => "+firstname);
        System.out.println("Your password is => "+pwd);
        System.out.println("-------------------------------"); 
        Login r=new Login();
        r.Login(firstname,pwd);
        }
        public static void showmenu()
        {
            Scanner sa=new Scanner(System.in);
            System.out.println("--------------");
            System.out.println("Billing System");
            System.out.println("--------------");
            
            System.out.println("1.Grocerry List");
            System.out.println("2.Amount of Vegetables");
            System.out.println("3.Billing");
            System.out.println("4.Exit");
            System.out.println("--------------");
            System.out.println("Enter your choice:");
            int a;
            a=sa.nextInt();
           
            
            switch(a)
            {
                
                case 1:
                    Details d=new Details();
                    d.GrocerryList();
                    showmenu();
                    break;
                case 2:
                    Amount am=new Amount();
                    am.tableWithLines();
                    showmenu();
                    break;
                case 3:
                    Availability av=new Availability();
                    av.available();
                    showmenu();
                    break;
                case 4:
                    System.out.println("-------------------------");
                    System.out.println("Thank you for purchasing");
                    System.out.println("Happy Shopping!!! ");
                    System.out.println("-------------------------");
                    sa.close();
                    break;
            }
            
            
        }
    

    }
    

public class Registration extends Register
{
    public static void main(String args[])
    {
        
       Login s=new Login();
       s.Register();
       
    }
}