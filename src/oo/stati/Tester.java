package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Student std2 =new Student(58,98,75);
        Student std3 =new Student(58,98,68);
        System.out.println(std2.pass);
    	std2.pass=70;
		std2.print();
		std3.print();
        GraduateStudent std4 =new GraduateStudent(58,98,75);
        std4.thesis=80;
        std4.print();
        GraduateStudent std5 =new GraduateStudent(58,98,75);
        std5.thesis=80;
        std5.print();
        ArrayList<Student> list = new ArrayList();
		list.add(new Student(58,98,75));
		list.add(new Student(58,98,75));
		list.add(new Student(58,98,75));
		list.add(new GraduateStudent(58,98,75));
		list.add(new GraduateStudent(58,98,75));
		for(int ii=0;ii<list.size();ii++){
			Student stu =list.get(ii);
	        stu.print();

			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
