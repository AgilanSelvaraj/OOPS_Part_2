package OOPS_Part2andArrays.Assignment_4;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args){
		Scanner inputString = new Scanner(System.in);
		
		System.out.println("Enter the Srting");
		String sringValue = inputString.next();
		System.out.println("String length is: " + sringValue.length());

		char[] stringToChar = sringValue.toCharArray();
		
		int n=stringToChar.length-1;
		
		while(n<=stringToChar.length){
			if(n<0){
				break;
			}
			System.out.println(stringToChar[n]);
			n--;
		}
		

		
				
		
	}

}
