package oo.test;

public class Member {
String id;
private int age;
String name;
void setAge(int age){
	if(age<0){
		age=0;
	}
	this.age =age; 
}
	public Member(String name){
		System.out.println("member constructor");
		this.name=name;
	}

	public Member(){
		
	}

	
	
	
	
	
	
public int getAge(){
	return age;
}


}
