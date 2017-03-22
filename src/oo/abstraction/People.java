package oo.abstraction;

public class People {

	int numbers;
	int women;
	int men;
	int children;
	 public People(int women,int men,int children  ){
		  this.women=women;
		  this.men=men;
		  this.children=children;
		  this.numbers=women+men+children;
			
			
			
			
			
			
			
		}
	public static void main(String[] args) {
	    People P2 = new People(200,200,300); 
	    People P3 = new People(200,200,400); 
	    People P4 = new People(200,200,500); 
	    People[] people =new People[3];
		people[0]=P2;
		people[1]=P3;
		people[2]=P4;
	    for(int ii =0;ii<3;ii++){
			System.out.println(people[ii].women);
			System.out.println(people[ii].men);
			System.out.println(people[ii].children);
			System.out.println(people[ii].numbers);
			}
	
	}

}
