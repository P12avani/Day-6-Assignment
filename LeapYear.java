package com.codegnan.operatorexamples;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
          int num=scanner.nextInt();
        String result=(num%4==0&& num%100!=0||num%400==0)?"Leap year":"Not a leap year";
         System.out.println(result);
         scanner.close();
	}

}
