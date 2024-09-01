package com.evergent.corejava.interfaces1;
public class BookImpl2 implements Book{
	public void bookTitle() {
		System.out.println("Corejava" +cname);
	}
	public void bookAuthor(){
		System.out.println("oracle company");
	}
	public void bookPrice(){
		System.out.println("550");
		
	}
	public void show() {
		System.out.println("local method");
	}
	public static void main(String[] args) {

			Book book = new BookImpl2();
			book.bookAuthor();
			book.bookTitle();
			book.bookPrice();
			//book.show();
	}

}
