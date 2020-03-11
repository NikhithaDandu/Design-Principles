package com.Epam.mavenDemo;

import java.util.Scanner;

public class KissPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       int num1 = s.nextInt();
       int num2 = s.nextInt();
       System.out.println("1.for Addition\n2.for Subtraction\n3.for Multiplication\n4.for Division\n");
       int opr = s.nextInt();
       System.out.println("Result = "+result(num1,num2,opr));
	}

	private static int result(int num1, int num2, int opr) {
		// TODO Auto-generated method stub
		int res[] = {num1+num2,num1-num2,num1*num2,num1/num2};
		return res[opr-1];
	}

}
