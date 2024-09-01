package com.evergent.corejava.objectclassmethods;
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name= name;
		this.age=age;
	}
	public String toString() {
		return name + age;
	}
}
public class PersonData {

	public static void main(String[] args) {
		Person p = new Person("Rohith",22);
		System.out.println(p);
		System.out.println(p.hashCode());
	}

}
