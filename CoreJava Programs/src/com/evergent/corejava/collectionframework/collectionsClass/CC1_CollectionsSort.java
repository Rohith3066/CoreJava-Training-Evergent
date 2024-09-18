package com.evergent.corejava.collectionframework.collectionsClass;
import java.util.*;
public class CC1_CollectionsSort {
	public static void main(String[] args) {
		 // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(3);
//        numbers.add(8);
//        numbers.add(1);
//        numbers.add(9);
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(7);
//        numbers.add(6);
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
        	numbers.add(sc.nextInt());
        }
        // Before Sorting List
        System.out.println("Original list: " + numbers);
        // Sorting the list in ascending order
        Collections.sort(numbers);
        // Display the  After sorted list
        System.out.println("Sorted list (ascending order): " + numbers);

	}

}
