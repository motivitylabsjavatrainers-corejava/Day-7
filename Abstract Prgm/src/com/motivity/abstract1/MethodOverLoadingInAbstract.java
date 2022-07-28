package com.motivity.abstract1;
abstract class Car30
{
	abstract void car(String brand,int cost );
	abstract void car(int speed,int milage );
}


public class MethodOverLoadingInAbstract extends Car30 {
	public void car(String brand,int cost)
	{
		System.out.println("car brand is "+brand+", cost is "+cost);
		
	}
	public void car(int speed,int milage)
	{
		System.out.println("car speed is "+speed+", milage is "+milage);
	}

	public static void main(String[] args) {
		 Car30 car23=new MethodOverLoadingInAbstract();
		 car23.car("BMW",10000);
		 car23.car(150, 30);
		 
		
		

	}

}
