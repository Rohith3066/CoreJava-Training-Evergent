package com.evergent.corejava.javabeans;
import java.io.Serializable;
 class ProductBean implements Serializable{
	private int pno;
	private String pname;
	private int price;
	public ProductBean(int pno,String pname,int price) {
		this.pno = pno;
		this.pname=pname;
		this.price=price;
	}
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public int getPrice() {
		return price;
	}
}
public class ProductImpl{
	public static void main(String[] args) {	
		ProductBean e = new ProductBean(1,"GT-650",500000);		
		System.out.println("Product number:"+e.getPno());
		System.out.println("Product  name:"+e.getPname());
		System.out.println("Product  salary:"+e.getPrice());
		}
}
