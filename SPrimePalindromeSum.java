//WPTD find the sum of prime palindrome numbers and check the sum is prime palindrome or not.

import java.util.Scanner;

public class SPrimePalindromeSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("Enter the Starting Number");
		int start=sc.nextInt();
		
		System.out.println("\nEnter the Ending Number");
		int end=sc.nextInt();
		
		System.out.print("\nPrime Palindrome Numbers from " + start +" to "+ end + " = ");
		
		while(start<=end)
		{
			int num=start;
			
			int rev=0;
				
			while(num>0)                       //Reverse Logic
			{
				int digit=num%10;
					
				rev=rev*10+digit;
					
				num=num/10;	
			}
			
			if(rev==start)
			{
			//--------------------------------------------------Prime Number--------------------------------------------------
				int i=2;
				
				while(rev>=i)
				{
					if(rev%i==0)                          
					{
						break;                    
					}
					
					i++;		
				}
				
				if(rev==i)                     //Prime
				{
					System.out.print(rev + " ");
					
					sum=sum+rev;
				}	
			}
					start++;
		}
		
		System.out.println("\n\nSum of Prime Palindrome Numbers = " +sum);
		
		//---------------------------------------Check Sum is Prime Palindrome or not--------------------------------------------
		
		int num=sum;
		int temp=num;
		int rev=0; 
		
		while(num>0)                           //Reverse the Original Value
		{      
			int digit=num%10;
			
			rev=(rev*10)+digit;  
			
			num=num/10;	                           	
		}
		
		if(rev==temp)                          //Palindrome
		{
			int i=2;
			
			while(temp>=i)                               
			{
				if(temp%i==0)                        
				{
					break;                  
				}
				
				i++;                               
			}
			
			if(temp==i)                        //Prime
			{
				System.out.println("\n\nPrime Palindrome Number ");
			}	
			else
			{
				System.out.println("\nNot Prime Palindrome Number ");
			}
		}
		
		else
		{
			System.out.println("\nNot Palindrome Number");
		}		
	}
}
