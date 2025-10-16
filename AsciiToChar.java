package com.codegnan.operatorexamples;
import java.util.Scanner;
public class AsciiToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		char ch=(char) num;
		System.out.println("character:"+ch);
		scanner.close();
	}

}
