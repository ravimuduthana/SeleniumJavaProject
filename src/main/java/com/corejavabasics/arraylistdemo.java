package com.corejavabasics;

import java.util.ArrayList;

public class arraylistdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<String>();
		a.add("Ravi");
		a.add("hyd");
		a.add("baci");
		System.out.println(a.get(1));
		a.remove(1);
		System.out.println(a.get(1));
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		//enhanced for loop
		for(String s:a)
		{
			System.out.println(s);
		}
		//item present in arraylist
		System.out.println(a.contains("bang"));
		
		
	}

}
