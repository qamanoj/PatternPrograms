package com.corejava.part3;

public class Program7 
{
	public static void main(String[] args)
	{
		int a=9;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				a--;
			}
			System.out.println();
		}
	}
}
