package oo.stati;

public class Student {
	   int english;
	    int math;
	    int chinese;
		static int pass=60;
		public Student( ){

			
		}
		public Student( int english, int math,int chinese){
			super();
			this.english =english;
			this.math =math;
			this.chinese =chinese;

			
			
		}
		public void print(){
			
			System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese)+"\t");
			
		}
		
		public String getScore(int score){
			if(pass>score){
				return String.valueOf(score)+"*";
				
			}
			else{
				return String.valueOf(score);
				
				
				
			}
			
		}
		
		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
