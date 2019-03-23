package com.corejava.part5;

public class program4 
{
	public static void main(String[] args) 
	{
		int a=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");  
			}	
			for(int k=1;k<=5-a;k++)
			{
				System.out.print(k);
			}
			a++;
			System.out.println();
		}	

	}
}
