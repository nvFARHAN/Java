package com.farhan;

public class Check {
	void check(char c)
	{
		int i = c;
		if((i>=65 && i<=90)|| (i>=97 && i<=122))
		{
			switch(c)
			{
			case 'a' :
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': System.out.println("Vovel");
			break;
			default : System.out.println("Consonant");
			}
		}
		else
			System.out.println("Wrong charecter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c1 = new Check();
		c1.check('E');
		c1.check('Z');
		c1.check('&');
	}
}
