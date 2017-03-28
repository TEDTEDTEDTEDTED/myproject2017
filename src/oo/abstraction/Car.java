package oo.abstraction;





public class Car {

	
	    int cc;
	    String name;
	    String type;
	    float milage;
	    int status;
	 public Car(String type,String name,int cc){
		    this.cc=cc;
		    this. name=name;
		    this. type=type;
		   
		 
	 }
		    public  void  setMilage(int m){
		    	milage=m;
		    	
		    	
		    	
		  
		    }
		    public  float  addMilage(int m){
		    	milage=m;
		    	return milage;
		    	
		  
		    }

		    public  void maintain(int s){
		    	status=s;
		    
	
		  
		    }

		 
		 
		 
	 
}
	