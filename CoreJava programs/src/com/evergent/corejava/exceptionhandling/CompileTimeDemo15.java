package com.evergent.corejava.exceptionhandling;
import java.io.*;
import java.util.*;
public class CompileTimeDemo15 {
	public static void main(String[] args) {
		try {
			File file = new File("C:/mydata/myinfo.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
