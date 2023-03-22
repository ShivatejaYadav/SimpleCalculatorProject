package com.tej;
/**
 * @author Shivateja Yadav
 * @since 2023
 */

import java.util.Scanner;

public class Calculator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int num1, num2;
	        System.out.println("Enter first number:");
	        num1 = scanner.nextInt();
	        
	        System.out.println("Choose an operation:\n +  (Addition)\n -  (Subtraction)\n *  (multiplication)\n /  (Division)");
	        char operator = scanner.next().charAt(0);
	        
	        System.out.println("Enter second number:");
	        num2 = scanner.nextInt();

	        

	        int result;
	        switch(operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                result = num1 / num2;
	                break;
	            default:
	                System.out.println("Invalid operator");
	                return;
	        }

	        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	    }
	}


