package oo.shopping;

public class SilverCustomer extends Customer {
	 double discount=amount*0.05;
	

	public SilverCustomer(int amount) {
		super(amount);
		
	}
	public SilverCustomer() {
		
		
	}
	void print(int money){
		System.out.println(money*0.9+"  "+0);
	}
	public void print(){
		System.out.println(amount+"\t"+discount+"\t"+0);
	}
	
	
	
	
	
	
	
}
