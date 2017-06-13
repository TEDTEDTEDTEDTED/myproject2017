package oo.shopping2;

import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> list =new ArrayList<>();
		list.add(new NormalCustomer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new GoldenCustomer(10000));
		list.add(new GoldenCustomer(15000));
		list.add(new SilverCustomer(1000));
		list.add(new NormalCustomer(6000));
		for(int GG =0;GG<list.size();GG++){
			Customer cust = list.get(GG);
			if(cust instanceof SilverCustomer && !(cust instanceof GoldenCustomer)){
			System.out.print("*"+"SI"+"   ");
			SilverCustomer HAHA =(SilverCustomer) cust; 
			HAHA.print();
			System.out.print("*"+"SI"+"   ");
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
