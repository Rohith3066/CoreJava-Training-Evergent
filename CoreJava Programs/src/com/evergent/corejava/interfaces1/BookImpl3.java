package com.evergent.corejava.interfaces1;
public class BookImpl3 implements Book,NewBook{
	public void bookTitle() {
		System.out.println("Corejava" +cname);}
	public void bookAuthor(){
		System.out.println("oracle company");}
	public void bookPrice(){
		System.out.println("550");}
	public void show() {
		System.out.println("local method");}
	public void MyData() {
		System.out.println("Interface");}
	public void addNewBook() {
		System.out.println("java new version");}
	public static void main(String[] args) {
			BookImpl3 book = new BookImpl3();
			book.bookAuthor();
			book.bookTitle();
			book.bookPrice();
			book.show();
			book.addNewBook();
			book.MyData();}
}
