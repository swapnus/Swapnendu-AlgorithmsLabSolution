package com.greatlearning.trans;
import java.util.Scanner;
public class PayMoney {

	private int size;
	private int transactions[] ;
	private int targetNo;
	
	
	public void checkTargetach()
	{
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the size of transaction array");
	size = sc.nextInt();
	transactions= new int[size];
	System.out.println ("Enter the values of Array");
	for (int i=0; i<size ; i++)
	{ transactions[i]= sc.nextInt(); 
	}
   System.out.println("Enter the total no. of targets that needs to be acheived ");
   targetNo = sc.nextInt();
   while (targetNo !=0)
   {int flag=0;
    int target;
    System.out.println("Enter the value of Target");
    target=sc.nextInt();
    long totalTarget=0;
    for (int i=0; i<size ; i++)
	{ totalTarget += transactions[i];
	if (totalTarget >= target)
	{System.out.println("Target Acheived in " + (i+1) + "transactions");
	 flag=1;
	 break;
	}
	 
	
	
	}
    
	}
   
    
   }
   
   
}
