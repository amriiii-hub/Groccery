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
public class Transaction{

    
    public void Trans()
    {
    int bal,finbal;
    Availability a=new Availability();
    int balance=a.amountnew;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount to pay: ");
    bal=sc.nextInt();
    if(balance==bal)
    {
        System.out.println("Your amount of Rs: " +balance+ " is paid successfull" );
        
    }
    else if(bal>balance)//200>190
    {
        bal=bal-balance;//200-190=10
        System.out.println("Your amount of Rs: " +balance+ " is paid successfull and Rs: " +bal+ " is returned successfully" );
    }
    else if(bal<balance)//190<200
    {
        balance=balance-bal;//200-190=10
        System.out.println("Your amount of Rs: " +bal+ "is insufficient for this payment");
        System.out.println("Please pay amount of Rs: " +balance+ " to get your vegetables");
        System.out.println("Enter your amount to pay: ");
        finbal=sc.nextInt();
        if(finbal==balance)
        {
            System.out.println(" Your payment is successfull");
        }
        else if(finbal>balance)
        {
            finbal=finbal-balance;
            System.out.println("Your amount of Rs: " +balance+ " is paid successfull and Rs: " +finbal+ " is returned successfully" );
        }
        else
        {
            System.out.println("Your payment failed ");
        }
    }
    else
    {
        System.out.println("Transaction failed");
    }
    }
    
}
