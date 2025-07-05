package com.corejavabasics;

public class methodsdemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		methodsdemo d = new methodsdemo();

		String name = d.getData();

		System.out.println(name);

		methodsdemo2 d1 = new methodsdemo2();

		d1.getuserdata();

		getData2();


	}

		public String getData()

		{

			System.out.println ("hello world");
	
			return "rahul shetty";

		}

		public static String getData2()

		{

			System.out.println ("hello world");
	
			return "rahul shetty";

		}
	}

