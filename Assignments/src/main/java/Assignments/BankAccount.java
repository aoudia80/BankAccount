package Assignments;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		
			int Options;
				
			  do {
			  
				  System.out.println("******* ABC Bank ******"); 
				  System.out.println("1. Create Account");
				  System.out.println("2. Credit Amount");
				  System.out.println("3. Debit Amount");
				  System.out.println("4. Transfer Amount");
				  System.out.println("5. Mini Statement"); 
				  System.out.println("6. Exit");
			
			  Scanner sc1=new Scanner(System.in);  
			  System.out.println("*************************"); 
			  System.out.println("Enter an option number");
			  System.out.println("*************************");
			  Options = sc1.nextInt();
			 			
				switch (Options) {
				case 1: {
					System.out.println("*************************"); 
					System.out.println("Create Account");
					System.out.println("*************************"); 
					break;
				}
				case 2: 
					{System.out.println("*************************"); 
					System.out.println("Debit Amount");
					System.out.println("*************************"); 
					break;
				}
				case 3: {
					System.out.println("*************************"); 
					System.out.println("Debit Amount");
					System.out.println("*************************"); 
					break;
				}
				case 4: {
					System.out.println("*************************"); 
					System.out.println("Transfer Amount");
					System.out.println("*************************"); 
					break;
				}
				case 5: {
					System.out.println("*************************"); 
					System.out.println("Mini Statement");
					System.out.println("*************************"); 
					break;
				}
				case 6: {
					System.out.println("*************************"); 
					System.out.println("Exit");
					System.out.println("*************************"); 
					break;
				}	
				default:
					System.out.println("there is no option for the given number");
					break; 
				}
				}
			  
			  while (Options !=6); 
			  System.out.println("Thank You, Please Visit Again ");
			}  
	}
			  
