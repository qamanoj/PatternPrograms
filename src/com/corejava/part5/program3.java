package com.corejava.part5;

public class program3 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");  
			}	
			for(int k=i;k<=5;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
