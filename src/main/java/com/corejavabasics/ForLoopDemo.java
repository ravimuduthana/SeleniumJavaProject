package com.corejavabasics;

public class ForLoopDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//for loop arr.length - 5
		int[]arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[]arr2= {10,11,12,13,14,15};
		
		for(int i = 0; i< arr.length; i++) //4
		{

			System.out.println(arr[i]);

		}
		for (int i =0;i<arr2.length; i++)
		{

			System.out.println(arr2[i]);

		}
		
		String[] name = {"rahul", "shetty", "selenium"};

		for(int i =0; i<name.length;i++)
		{

			System.out.println(name[i]);

		}
		for( String s: name)

		{

			System.out.println(s);

		}
		


	}

}
