package com.evergent.corejava.exceptionhandling;
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello: "+message);
	}
}
public class UserdefinedException {
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno > 100)
			throw new ProductNotFoundException("This product is not there");
		else
			System.out.println("This product is there");
	}
	public static void main(String[] args) {
		try {
			UserdefinedException u = new UserdefinedException();
			u.myData();			
		}
		catch(Exception e) {
			System.out.println("I can handle:"+e);
		}

	}

}
