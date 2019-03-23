package com.corejava.ABCDpart;

public class program5 
{
	public static void main(String[] args) 
	{
		int ascii=65;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ascii);			
			}			
			System.out.println();
			ascii++;
		}		
	}
}
