package com.driver;

public class Main {
  
	public static void main(String[] args) {
		RWOnly only = new RWOnly();
		
		only.setName("King");
		System.out.println(only.getName());
	}
}