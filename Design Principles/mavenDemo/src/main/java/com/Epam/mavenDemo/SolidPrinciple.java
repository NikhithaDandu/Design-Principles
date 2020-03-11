package com.Epam.mavenDemo;

import java.util.Scanner;

public class SolidPrinciple extends Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         Calculator c = new SolidPrinciple();		
		         Scanner s = new Scanner(System.in);
		         int a[] = new int[2];
		         for(int i=0;i<2;i++){
		        	 a[i] = s.nextInt();
		         }
		         char opr = s.next().charAt(0);
		         switch(opr){
		         case '+' : System.out.println("Addition : "+c.add(a[0],a[1]));
		         break;
		         case '-' : System.out.println("Subtraction : "+c.sub(a[0],a[1]));
		         break;
		         case '*' : System.out.println("Multiplication : "+c.mul(a[0],a[1]));
		         break;
		         case '/' : System.out.println("Division : "+c.div(a[0],a[1]));
		         break;
		         default : System.out.println("INVALID OPERATOR"); 
		         }
			}
			@Override
			public int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
			@Override
			public int sub(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1-num2;
			}
			@Override
			public int mul(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1*num2;
			}
			@Override
			public int div(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1/num2;
			}
	}


