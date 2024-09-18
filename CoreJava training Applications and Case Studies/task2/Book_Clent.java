package com.evergent.corejava.collectionframework.task2;
import java.util.*;
class Book {
	private String isbn;
	private String bookName;
	private int  price;
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}			
}
interface BookInterface {
	String addBook(Book b);
	void searchByIsbn(String isbn);
	void getAllBooks();		
}
class BookImp implements BookInterface {
	Set<Book> bookSet=null;
	public BookImp() {
		bookSet=new HashSet<Book>();
	}
	public String addBook(Book b) {
		bookSet.add(b);
		return b.getIsbn();
	} 
	public void searchByIsbn(String isbn) {
		boolean b=false;
		if(bookSet.size()>0 && bookSet!=null){
			for(Book book:bookSet){
				if(book.getIsbn().equals(isbn)){
					System.out.println(book.getIsbn()+" "+book.getBookName()+" "+book.getPrice());	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The book is not found");
			
	}
	public void  getAllBooks() {
			if(bookSet.size()>0){
				for(Book book:bookSet){
					System.out.println(book.getIsbn()+" "+book.getBookName()+" "+book.getPrice());
				}					
			}else{
				System.out.println("No books are available");
			}
	}
}
public class Book_Clent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookInterface book=new BookImp();
		for(;;){
			System.out.println("1. Add Book 2.Search by isbn 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the isbn");
				   String isbn=sc.next();
				   System.out.println("Enter the book name");
				   String name=sc.next();
				   System.out.println("Enter the price");
				   int price=sc.nextInt();
				   Book b=new Book();
				   b.setIsbn(isbn);
				   b.setBookName(name);
				   b.setPrice(price);
				   String message=book.addBook(b);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the isbn");
			   	   String isb=sc.next();
			   	   book.searchByIsbn(isb);
			   	   break;			  			
			case 3:book.getAllBooks();
				break;
			case 4:System.exit(0);
			}			
		}
	}
}
