package com.Epam.mavenDemo;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	      int num1 = s.nextInt();
	      int num2 = s.nextInt();
	      char opr = s.next().charAt(0);
	      switch(opr){
	      case '+' : System.out.println("Addition: "+ add(num1,num2));
	                 break;
	      case '-' : System.out.println("Subtration "+ sub(num1,num2));
	                 break;
	      case '*' : System.out.println("Multiplication "+ mul(num1,num2));
	                 break;
	      case '/' : System.out.println("Division "+ div(num1,num2));
	                 break;
	      case '%' :System.out.println("Modulous "+ mod(num1,num2));
	      break;
	      default : System.out.println("INVALID OPERATOR");
	      }
	    }

	private static int mod(int num1, int num2) {
		// TODO Auto-generated method stub
		int modulous = num1%num2;
		return modulous;
	}

	private static int div(int num1, int num2) {
		// TODO Auto-generated method stub
		int division = num1/num2;
		return division;
	}

	private static int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		int mult = num1*num2;
		return mult;
	}

	private static int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		int diff = num1-num2;
		return diff;
	}

	private static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int sum = num1+num2;
		return sum;
	}
	}


