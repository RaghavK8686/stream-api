package com.ty;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class C {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(50);
		a1.add(90);
		a1.add(40);
		
		
//		System.out.println(a1);//[10, 50, 90, 40]
//		
//		Integer min=a1.stream().min((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println(min);//10
//		
//		Integer max=a1.stream().max((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println(max);//90
//		
		// l.stream().forEach(Function)
//		l.stream().forEach(Syso)
		Consumer<Integer> f = i -> {
			System.out.println("The sq of" + i + " is " + (i * i));
		};
//		al.stream().forEach(f);

		Integer[] i = a1.stream().toArray(Integer[]::new);
		for (Integer i1 : i) {
			System.out.println(i1);/*
									 * 10 50 90 40
									 */
		}
		
		
	}
}
