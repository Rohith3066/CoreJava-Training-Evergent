package com.evergent.corejava.patternprogramming;

public class Pattern5 {

	public static void main(String[] args) {
		int c=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(c <= 9)
					System.out.print("0"+ ++c +" ");
				else
					System.out.print(++c+" ");
			}
			System.out.println();
		}

	}

}
