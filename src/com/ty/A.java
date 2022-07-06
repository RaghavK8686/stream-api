package com.ty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(200);
		list.add(20);
		list.add(12);
		list.add(35);
		
		List l1=list.stream().filter(p->p%5==0).collect(Collectors.toList());
//		for(int s: l1)
//		{
			System.out.println(l1);
		
	}
	
	
}
