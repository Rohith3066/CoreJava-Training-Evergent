package com.evergent.corejava.constructor;
class Car{
	String color;
	int maxspeed;
	Car(){
		color = "white";
		maxspeed = 120;
	}
	Car(String color,int maxspeed){
		this.color =color;
		this.maxspeed = maxspeed;
	}
	public void display() {
		System.out.println("Car color: "+color);
		System.out.println("Car speed: "+maxspeed);
	}
}

public class MyCar7 {

	public static void main(String[] args) {
		Car c1= new Car();
		Car c2= new Car("Red",150);
		c1.display();
		c2.display();

	}

}
