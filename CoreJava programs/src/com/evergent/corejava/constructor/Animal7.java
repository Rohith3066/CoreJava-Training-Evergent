package com.evergent.corejava.constructor;
class Animal{
	private String name;
	private int age;
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("Animal name is: "+name);
		System.out.println("Animal age is "+age);
	}
}
class Dog extends Animal{
	private String breed;
	public Dog(String name,int age,String breed) {
		super(name,age);
		this.breed=breed;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Animal breed is "+breed);
	}
}
public class Animal7 {

	public static void main(String[] args) {
		Dog d = new Dog("Bruce",5,"huskey");
		d.displayInfo();

	}

}
