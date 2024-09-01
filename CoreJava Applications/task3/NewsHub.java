package com.evergent.corejava.collectionframework.task3;
import java.util.*;
class Book {
	private String newspaper;
	private String date;
	private int  price;
	public String getNewspaper() {
		return newspaper;
	}
	public void setNewspaper(String newspaper) {
		this.newspaper = newspaper;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
		return b.getNewspaper();
	} 
	public void searchByIsbn(String isbn) {
		boolean b=false;
		if(bookSet.size()>0 && bookSet!=null){
			for(Book book:bookSet){
				if(book.getNewspaper().equals(isbn)){
					System.out.println(book.getNewspaper()+" "+book.getDate()+" "+book.getPrice());	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The News Paper is not found");
			
	}
	public void  getAllBooks() {
			if(bookSet.size()>0){
				for(Book book:bookSet){
					System.out.println(book.getNewspaper()+" "+book.getDate()+" "+book.getPrice());
				}					
			}else{
				System.out.println("No books are available");
			}
	}
}
public class NewsHub {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookInterface book=new BookImp();
		for(;;){
			System.out.println("1. Add News Paper 2.Search by news paper name 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the news paper name");
				   String isbn=sc.next();
				   System.out.println("Enter the date");
				   String name=sc.next();
				   System.out.println("Enter the price");
				   int price=sc.nextInt();
				   Book b=new Book();
				   b.setNewspaper(isbn);
				   b.setDate(name);
				   b.setPrice(price);
				   String message=book.addBook(b);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the news paper");
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
