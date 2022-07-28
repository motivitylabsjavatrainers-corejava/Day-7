package com.motivity.abstract1;

import java.io.*;


abstract class Car1 {
	abstract void millage();


  static void move()
  {
	  System.out.println("move forword");
  }
  
}


class Engine extends Car1 {
	void millage()
	{
		System.out.println("millage is 100km");

 
 
 }
}


public class StaticMethod {
 public static void main(String args[])
 {

     Engine.move();
 }
}