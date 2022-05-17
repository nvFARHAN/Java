package com.farhan;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factor(12);
	}

	static void factor(int n)
	{
		if(n<2 || n>100)
		{
			System.out.println("");
			return;
		}
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
	}
}
