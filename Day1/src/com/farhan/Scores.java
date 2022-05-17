package com.farhan;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate(1,2,3,4,5);
	}
	static void calculate(int ones,int twos,int threes,int fours,int sixes)
	{
		int total = ones*1+twos*2+threes*3+fours*4+sixes*6;
		System.out.println(total);
	}
}
