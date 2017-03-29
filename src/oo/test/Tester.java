package oo.test;


import oo.abstraction.Car;
import java.util.ArrayList;
import java.util.Scanner;


public class Tester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c2 = new Car( "uuu","ggg",235465462);
		ArrayList<String> list = new ArrayList();
		list.add("335");
		list.add("829");
		list.add("886");
		list.add("554");
		System.out.println(list.size());
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.iterator());
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.toArray());
		System.out.println(list.indexOf("kkjkhjkhjk"));
		System.out.println(list.contains("77987"));
		list.clear();
		System.out.print(list);
	    Scanner uyrioyutio = new Scanner(System.in);
	    list.add("335");
		list.add("829");
		list.add("886");
		list.add("554");
		String gdflgkgdfg = uyrioyutio.nextLine();
		gdflgkgdfg=gdflgkgdfg.substring(gdflgkgdfg.length()-3);
		
		
		for(int ii =0;ii<list.size();ii++){
		if( gdflgkgdfg.equals(list.get(ii))){
			System.out.println("中獎");
            break;
			
		
		}
		
	}

	
	
}
}