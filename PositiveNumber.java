package com.codegnan.operatorexamples;
import java.util.Scanner;
public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
          int num=scanner.nextInt();
        String result=(num>0)?"Positive Number":"Negative number";
         System.out.println(result);
         scanner.close();
	}

}
