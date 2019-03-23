package com.corejava.part4;

public class Program5 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				int a=5;
				System.out.print(a-k);
			}
			System.out.println();
		}
	}
}
