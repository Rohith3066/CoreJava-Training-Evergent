package com.evergent.corejava.collectionframework.arraysclass;
import java.io.*;
import java.util.*;
class EvergentTopics implements Serializable  {
	private String name;
	private String description;
	private String id;
	public EvergentTopics(String name, String description, String id) {
		this.name = name;
		this.description = description;
		this.id = id;
	}
	public String toString() {
		return name + description +  id;
	} 
}
public class EvergentTopicsImpl {
	public static void main(String[] args) {
		List topics=Arrays.asList(new EvergentTopics("Encapsulation :","Inheritance :"," : OOPS"),
	            new EvergentTopics("CheckedException :","UnCheckedException :"," ExceptonsHandling"),
	            new EvergentTopics("SET","LIST","Collection"));		
		System.out.println(topics);		
		  List mydata=Arrays.asList(10,20,30);
		  System.out.println(mydata);
	}

}
