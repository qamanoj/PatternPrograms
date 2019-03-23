package com.corejava.DimondProgram;
public class Dimond1 
{
	public static void main(String[] args) 
	{
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			count=count+2;		
		}
		int count1=7;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			count1=count1-2;
		}
	}
}