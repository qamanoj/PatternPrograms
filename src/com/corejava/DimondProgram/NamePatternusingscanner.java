package com.corejava.DimondProgram;
import java.util.Scanner;

public class NamePatternusingscanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String s=sc.next();
		char array[]=s.toCharArray();
		for(int i=1;i<=array.length;i++)
		{
			for(int j=array.length-1;j>=i;j--)
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

