package com.corejava.squarepattrn;

public class programManoj 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||i==j&&i<=3||i+j==6&&j>=3||j==5)
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
		System.out.println("----------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1&&j!=1&&j!=5||j==1&&i!=1||j==5&&i!=1||i==3)
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
		System.out.println("----------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||j==5||i==j)
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
		System.out.println("---------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1&&j!=1&&j!=5||i==2&&j!=2&&j!=3&&j!=4||i==3&&j!=2&&j!=3&&j!=4||
						i==4&&j!=2&&j!=3&&j!=4
						||i==5&&j!=1&&j!=5)
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
		System.out.println("---------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==3||i==5&&j!=5&&j!=4||j==1&&i!=1&&i!=2&&i!=3)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
