package com.corejava.part5;

public class program2 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");  
			}
              for(int k=5;k>=i;k--)
              {
            	  System.out.print(k);
              }
              System.out.println();
		}
	}
}
