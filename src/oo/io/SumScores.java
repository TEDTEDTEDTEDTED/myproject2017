package oo.io;

import java.util.Scanner;

public class SumScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int sum =0;
      Scanner scnner = new Scanner(System.in);
      for(int ii =0;ii<3;ii++){
    	  System.out.print("�п�J���Z:");
    	  String data = scnner.nextLine(); 
    	  try{
    		  int score =Integer.parseInt(data);
    		  sum+=score;
    		  
    	  }catch(NumberFormatException e){
    		  System.out.println("���Z�榡���ųW�w");
    		  
    		  
  

    	  }
		  System.out.println(sum);

    	  
    	  
    	  
    	  
    	  
      }
		
		
		
		
		
	}

}
