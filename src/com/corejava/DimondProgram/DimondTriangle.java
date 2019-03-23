package com.corejava.DimondProgram;

public class DimondTriangle 
{
	public static void main(String[] args) {
		int c=1;
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++)
			{
				System.out.print(a+" ");
				a++;
			}
			c=c+1;
			System.out.println();
		}
	}
}
