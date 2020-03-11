package com.Epam.mavenDemo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
      default : System.out.println("INVALID OPERATOR");
      }
    }

	private static int div(int num1, int num2) {
		// TODO Auto-generated method stub
		int quo = 0;
		while(num1 > 0){
			quo++;
			num1 = sub(num1,num2); 
		}
		return quo;
	}

	private static int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = 0;
		while(num2>0){
			res= add(res,num1);
			num2--;
		}
		return res;
	}

	private static int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	private static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
}
