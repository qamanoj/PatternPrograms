package com.corejava.DimondProgram;

public class Manoj 
{
	public static void main(String[] args) 
	{
		char array[]=new char[]{'m','a','n','o','j'};

		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");	   
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(array[k-1]+" ");	 	   
			}
			System.out.println();	   
		}

	}

}
