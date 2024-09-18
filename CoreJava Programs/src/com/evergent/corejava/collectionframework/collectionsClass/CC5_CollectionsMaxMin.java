package com.evergent.corejava.collectionframework.collectionsClass;
import java.util.*;
public class CC5_CollectionsMaxMin {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(15);
        // Finding the maximum element
        int max = Collections.max(numbers);
        // Finding the minimum element
        int min = Collections.min(numbers);
        // Displaying the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

	}

}
