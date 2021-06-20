/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
 class Login extends Register{
     public void Login(String firstname,String pwd)
     {  
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your User name => ");
        String username=sc.nextLine();
        System.out.println("Enter your Password => ");
        String password=sc.nextLine();
        //Register r=new Register();
        
        if(username.equals(firstname) && password.equals(pwd))
        {
            System.out.println("Logged in Successful");
            showmenu();
        }
        else if(username.isEmpty()&&password.isEmpty())
        {
            System.out.println("Please enter the details");
        }
        else
        {
            System.out.println("Register if you don't have an account");
        }
    
     }
      public void Login(String firstname,Long pwd)
     {  
        
    Scanner sw=new Scanner(System.in);
    System.out.println("Enter your User name => ");
        String username=sw.nextLine();
        System.out.println("Enter your OTP => ");
        Long otp=sw.nextLong();
       
        
        if(username.equals(firstname) && otp.equals(pwd))
        {
            System.out.println("Logged in Successful");
            showmenu();
        }
        else if(username.isEmpty()&&otp.toString().isEmpty())
        {
            System.out.println("Please enter the details");
        }
        else
        {
            System.out.println("Register if you don't have an account");
        }
        
     }
     
    
    
}
