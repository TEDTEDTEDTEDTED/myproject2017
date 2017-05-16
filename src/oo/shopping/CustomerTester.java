package oo.shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerTester {

	public static void main(String[] args) {
		ArrayList<Customer> list =new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new GoldenCustomer(10000));
		list.add(new GoldenCustomer(15000));
		list.add(new SilverCustomer(1000));
		list.add(new Customer(6000));
		for(int GG =0;GG<list.size();GG++){
			Customer cust = list.get(GG);
			if(cust instanceof SilverCustomer && !(cust instanceof GoldenCustomer))
			System.out.print("*");
			cust.print();
		}
		
		
		
		
		
		Customer CC = new Customer();
		SilverCustomer GG = new SilverCustomer();
		GoldenCustomer UU = new GoldenCustomer();
		
while(true){
	Scanner HAHA = new Scanner(System.in);
	String HAHAHAHAHA =HAHA.nextLine();
	String HAHAHA ="";
	int HAHAHAHA=0;
	String[] GGG=HAHAHAHAHA.split(" ");
	try{
	HAHAHA=GGG[0];
	HAHAHAHA=Integer.parseInt(GGG[1]);}
	catch(java.lang.ArrayIndexOutOfBoundsException e){
		break;
		
	}
	System.out.print(String.valueOf(HAHAHA));
		if(HAHAHA.equals("´¶")){
			CC.print(HAHAHAHA);
		}
	if(HAHAHA.equals("»È")){
			GG.print(HAHAHAHA);
		}
	if(HAHAHA.equals("ª÷")){
		UU.print(HAHAHAHA);
	}
		
	
}
		
		
		
		
		
		
	}

}
