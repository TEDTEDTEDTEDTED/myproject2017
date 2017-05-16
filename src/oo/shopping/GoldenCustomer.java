package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
    double returnmoney=amount*0.05;
    
	public GoldenCustomer(int amount) {
		super(amount);
		
	}

	public GoldenCustomer() {
		
		
	}
	void print(int money){
		System.out.println(money+"  "+money*0.9+"  "+money*0.05);
	}
	
	void print(){
		System.out.println(amount+"\t"+discount+"\t"+returnmoney);
	}
	
	
	
	
	
	
}
