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

public class Availability {
    int amount=0;
    public static int amountnew;
    public void available()
    {
        Scanner sr=new Scanner(System.in);
        int kg;
        String name;
        System.out.println("Enter the vegetable name to purchase: ");
        name=sr.nextLine();
        if(name.equals("Potato"))
        {
            System.out.println("Enter the no of kgs: ");
            kg=sr.nextInt();
            amount+=kg*45;
            System.out.println("Do you wish to buy some other Vegetables Press 1 to buy: ");
            
            int num,choice;
        choice=sr.nextInt();
        
        if (choice==1)
        {
            available();
        }
        else
        {
            System.out.println("The bill of your vegetables is: "+amount);
            amountnew=amount;
            Transaction t=new Transaction();
            t.Trans();
        }
       
        }
         else if(name.equals("Beetroot"))
                {
                System.out.println("Enter the no of kgs: ");
            kg=sr.nextInt();
            amount+=kg*50;
            System.out.println("Do you wish to buy some other Vegetables Press 1 to buy: ");
            
            int choice;
        choice=sr.nextInt();
        
        if (choice==1)
        {
            available();
        }
        else
        {
            System.out.println("The bill of your vegetables is: "+amount);
            amountnew=amount;
            Transaction t=new Transaction();
            t.Trans();
        }
       
                }
        else if(name.equals("Cauliflower"))
                {
                System.out.println("Enter the no of kgs: ");
            kg=sr.nextInt();
            amount+=kg*75;
            System.out.println("Do you wish to buy some other Vegetables Press 1 to buy: ");
            
            int num,choice;
        choice=sr.nextInt();
        
        if (choice==1)
        {
            available();
        }
        else
        {
            System.out.println("The bill of your vegetables is: "+amount);
            amountnew=amount;
            Transaction t=new Transaction();
            t.Trans();
        }
                }
        else if(name.equals("Beans"))
                {
                System.out.println("Enter the no of kgs: ");
            kg=sr.nextInt();
            amount+=kg*44;
            System.out.println("Do you wish to buy some other Vegetables Press 1 to buy: ");
            
            int num,choice;
        choice=sr.nextInt();
        
        if (choice==1)
        {
            available();
        }
        else
        {
            System.out.println("The bill of your vegetables is: "+amount);
            amountnew=amount;
            Transaction t=new Transaction();
            t.Trans();
        }
                }
        else if(name.equals("Carrot"))
                {
            System.out.println("Enter the no of kgs: ");
            kg=sr.nextInt();
            amount+=kg*30;
            System.out.println("Do you wish to buy some other Vegetables Press 1 to buy: ");
          
            int num,choice;
        choice=sr.nextInt();
        
        if (choice==1)
        {
            
            available();
            
        }
        else
        {
            System.out.println("The bill of your vegetables is: "+amount);
            amountnew=amount;
            Transaction t=new Transaction();
            t.Trans();
        }
                }
       
    }
}
