package com.corejava.DimondProgram;

public class Manoj2 
{
	public static void main(String[] args) {
		
		int c=1;
		String name="MANOJ";
		char a[]=name.toCharArray();
		for (int i =1; i<=3; i++)
		{
			for (int j =2; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++)
			{
				System.out.print(a[k-1]);
			}
			System.out.println();
			c=c+2;
		}
		int c1=3;
		String name1="MAN";
		char a1[]=name.toCharArray();
		for (int i =1; i<=2; i++)
		{
			for (int j =1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c1;k++)
			{
				System.out.print(a1[k-1]);
			}
			System.out.println();
			c1=c1-2;
		}
	}
}
