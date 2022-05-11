package Assignments;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		long units;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the numebr of units:");
		units = sc.nextLong();
		
		double billpay=0;
		
		
	    if(units<=50) //0-50: Rs.1 
			billpay=units*1;
	    
	     	    else if(units>=50 && units <=100) //50-100: Rs2 
			billpay=50*1+(units-50)*2;
	 
		    else if(units>=100 && units <=200)
			billpay=100*2+(units-100)*3; //100-200: Rs.3 
	    
		    else if (units >=200 && units <= 400) //200-400: Rs.4
		    billpay=100*2 + 200*3+(units-200)*4;
		    else if (units>400)
		    	billpay=units*5;
		
		 System.out.println("Bill to pay : " + billpay);
		
		// (50*1)+(50*2)+(20*3)=Rs.210	
		/*
		 * class 
		 * 0-50: Rs.1 
		 * 50-100: Rs2 
		 * 100-200: Rs.3 
		 * 200-400: Rs.4
		 *  >400: Rs.5
		 */
		}
		
		}


