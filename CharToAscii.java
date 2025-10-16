package com.codegnan.operatorexamples;
import java.util.Scanner;
public class CharToAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch =scanner.next().charAt(0);
		int result=(int) ch-1;
		System.out.println(result);
		scanner.close();
	}

}
