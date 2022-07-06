package com.ty;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;

public class hello {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
//		System.out.println(list);//[10, 20, 30, 5]
		
		
		
//	
//		List<Integer> list1=list.stream().sorted().collect(Collectors.toList());
//		System.out.println(list1);//[5, 10, 20, 30]
//		
//		List<Integer> list2=list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
//		System.out.println(list2);//[30, 20, 10, 5]
//		
//		List<Integer> list3=list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
//		System.out.println(list3);//[5, 10, 20, 30]
//		
//		List<Integer> list4=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
//		System.out.println(list4);//[30, 20, 10, 5]
//		
//		
		
//		for (int i = 0; i <= 100; i++) {
//			list.add(i);
//		}
//		for(Integer j:list)
//		{
//			System.out.println(list);
//		}
//		
//		List<Integer> l=list.stream().map(I->I+2).collect(Collectors.toList());
//		System.out.println(l);
//		long m=list.stream().filter(I->I<35).count();
//		System.out.println(m);//39
//		
		
	}

}
