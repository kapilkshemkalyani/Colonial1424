package com.example.inclass4;

import java.util.Random;

public class HeavyWork {
	static final int COUNT = 1000000;
	static double getNumber(){
		double num = 0;
		Random rand = new Random();
		for(int i=0;i<COUNT; i++){
			num = num + rand.nextDouble();
		}
		return num / ((double) COUNT);
	}
	
	private void calculateAvg(int n1, int n2)
	{
		return (n1+n2)/2;
	}
}