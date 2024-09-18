package com.evergent.corejava.collectionframework.collectionsClass;
import java.util.*;
public class CC8_CollectionsReplaceAll {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Apple");
        items.add("Cherry");
        items.add("Apple");
        System.out.println("Before Modified list: " + items);
        // Replacing all occurrences of "Apple" with "Orange"
        Collections.replaceAll(items, "Apple", "Orange");
        // Displaying the modified list
        System.out.println("Modified list: " + items);

	}

}
/*
 *Collections.replaceAll()
This method replaces all occurrences of one specified value with another specified value in a list.

Replacing All Occurrences of a Value
 */

