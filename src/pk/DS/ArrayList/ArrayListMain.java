package pk.DS.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		// variation to create ArrayList
		// 1 variation
		ArrayList<Integer> list =new ArrayList<>(11);  // initial capacity is 11
		// 2 variation
		List<Integer> list1 =new ArrayList<>();
		// 3 variation
		List<String> list2= Arrays.asList("Prasad", "Shri", "Harsh");
				
		list1.add(2);
		list1.add(6);
		list1.add(4);
		list1.add(10);
		list1.add(8);
		
		// System.out.println(list1);
		
//		// 4 variation
//		List<Integer> list3= List.of(6,4,8,2,12,10);
//		
//		// error will occur
//		list3.addAll(list1);
//		System.out.println(list1);
		List<String> fruits= new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Date");
		
		fruits.remove("Apple");
		System.out.println(fruits);
		
		// sort the list
		Collections.sort(list1);
		System.out.println(list1);
		
		/*
		 * list.add(1); list.add(1); list.add(1); list.add(1); list.add(1); list.add(1);
		 * list.add(1); list.add(1); list.add(1); list.add(1); list.add(1);
		 */
		
		System.out.println(list.size());
//		list.add(1);
//		list.add(10);
//		list.add(11);
//		System.out.println(list.get(2));
//		System.out.println(list.size());
//		for(int i=0; i< list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
//		// iterate over the list it self
//		for(int x:list) {
//			System.out.print(x+" ");
//		}
//		System.out.println(list.contains(10));
//		System.out.println(list.contains(20));
//		
//		list.remove(2);
//		for(int x:list) {
//			System.out.println(x);
//		}
		
		// add on specific index
//		System.out.println("Add element in the middle of list: ");
//		
//		list.add(2, 20);
//		for(int z:list) {
//			System.out.println(z);
//		}
		
//		list.set(2, 50);
//		System.out.println(list);
		
		// using reflections we can display the capacity of ArrayList
		// not used in production
		
		
	}

}
