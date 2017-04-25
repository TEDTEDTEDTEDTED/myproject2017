package oo.mid;
public class Meal {
int priceA=99;
int priceB=120;
int priceC=150;
int numberA;
int numberB;	
int numberC;	
int total;
public Meal(int numberA,int numberB,int numberC){
	this.numberA=numberA;
	this.numberB=numberB;
	this.numberC=numberC;
}
public void totalprices(){
	total= priceA*numberA+priceB*numberB+priceC*numberC;
}
public void setprice(int priceA,int priceB,int priceC){
	this.priceA=priceA;
	this.priceB=priceB;
	this.priceC=priceC;
}
}
