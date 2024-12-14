package collectionapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortingDemo {

	public static void main(String[] args) {
		
		//how to sort an array
		int[] nums = {50,25,64,40,36};
		
		Arrays.sort(nums);
		
		for(int i : nums) {
			System.out.println(i);
		}
		
		//how to sort a list
		List<String> fruits = new ArrayList<>();		
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("grapes");
		
		Collections.sort(fruits);
		
		System.out.println(fruits);
	}
}
