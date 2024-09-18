package com.evergent.corejava.collectionframework.collectionsClass;
import java.util.*;
public class CC9_SynchronizedList {
	public static void main(String[] args) {
		List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
		syncList.add("one");
		syncList.add("two");
		syncList.add("three");
// when iterating over a synchronized list,
//we need to synchronize access to the synchronized list
		synchronized (syncList) {
			Iterator<String> iterator = syncList.iterator();
			while (iterator.hasNext()) {
				System.out.println("item: " + iterator.next());
	}
}
}
}