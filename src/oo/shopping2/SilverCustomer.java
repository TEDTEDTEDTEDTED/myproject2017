package oo.shopping2;



public class SilverCustomer extends NormalCustomer {
	 double discount=amount*0.05;
		public SilverCustomer(int amount) {
			super(amount);
			
		}
	@Override
	public void print() {
		System.out.println(amount+"\t"+discount+"\t"+0);

	}

	public static void main(String[] args) {

		
		
		
		
		
	}

}
