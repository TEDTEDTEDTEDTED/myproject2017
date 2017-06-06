package oo.shopping2;

import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> list =new ArrayList<>();
		list.add(new NormalCustomer());
		list.add(new SilverCustomer());
		list.add(new GoldenCustomer());
		list.add(new GoldenCustomer());
		list.add(new SilverCustomer());
		list.add(new NormalCustomer());
		for(int GG =0;GG<list.size();GG++){
			Customer cust = list.get(GG);
			if(cust instanceof SilverCustomer && !(cust instanceof GoldenCustomer)){
			System.out.print("*"+"SC");
			SilverCustomer HAHA =(SilverCustomer) cust; 
			}
			cust.print();
			
		}
		for(Customer cust:list){
			if(cust instanceof SilverCustomer && !(cust instanceof GoldenCustomer)){
			SilverCustomer HAHA =(SilverCustomer) cust; 
			System.out.print("*");
			}
			cust.print();
			
		}
		

		
		
		
		
		
		
	}

}
