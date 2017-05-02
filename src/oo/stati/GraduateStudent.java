package oo.stati;

public class GraduateStudent extends Student {
    int thesis=70;
	public GraduateStudent(int english, int math, int chinese) {
		super(english, math, chinese);
		// TODO Auto-generated constructor stub
	}
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t"+thesis);
	}
	
	
}
