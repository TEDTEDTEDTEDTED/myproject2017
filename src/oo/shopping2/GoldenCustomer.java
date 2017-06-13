package oo.shopping2;

public class GoldenCustomer extends SilverCustomer{
	   double returnmoney=amount*0.05;
		public GoldenCustomer(int amount) {
			super(amount);
			
		}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(amount+"\t"+discount+"\t"+returnmoney);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
