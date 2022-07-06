package com.ty;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class B {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Anushka");
		l1.add("Sheela");
		l1.add("Sunny");
		l1.add("Dr Strange");
//		System.out.println(l1);//[Anushka, Sheela, Sunny, Dr Strange]
//
//		List<String> l2=l1.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
//		System.out.println(l2);//[Sunny, Sheela, Dr Strange, Anushka]
//		
//		List<String> l3=l1.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
//		System.out.println(l3);//[Anushka, Dr Strange, Sheela, Sunny]
//	
		Comparator<String> c=(s1,s2)->{
			int k1=s1.length();
			int k2=s2.length();
			if(k1>k2) return -1;
			else if(k1>k2) return +1;
			else return s1.compareTo(s2);
		};
		List<String> sortedList=l1.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList);//[Anushka, Dr Strange, Sheela, Sunny]
		
		
	}
}
