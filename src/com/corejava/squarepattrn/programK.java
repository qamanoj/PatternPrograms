package com.corejava.squarepattrn;

public class programK 
{
  public static void main(String[] args) 
  {
	  for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3||i+j==6&&j>=3||i==j&&i>=3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}
}
