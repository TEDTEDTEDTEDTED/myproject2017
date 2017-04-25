package oo.mid;
public class MealTester {
	public static void main(String[] args) {
	  Meal A = new Meal(2,3,4);
	  A.setprice(200, 300, 400);
	  A.totalprices();	
	  System.out.println(A.total);
	  Meal B = new Meal(5,6,7);
	  B.setprice(700,800 ,900 );
	  B.totalprices();	
	  System.out.println(B.total);
	}
}
