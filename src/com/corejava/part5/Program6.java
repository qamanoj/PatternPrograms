package com.corejava.part5;

public class Program6 
{
	public static void main(String[] args)
	{
		int a=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(a);
			}
			a--;
			System.out.println();
		}
	}
}
