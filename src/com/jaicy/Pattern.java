package com.jaicy;

public class Pattern {

	public static void main(String[] args) {
		binaryPattern(6);//6-> no of rows used

	}

	private static void binaryPattern(int n) {
		
		for(int i=1;i<=n;i++) {
			int start=(i%2==0)?0:1;
			for(int j=1;j<=i;j++) {
				System.out.print(start);
				start=1-start;     //for repeating 0's and 1's
			}
			System.out.println();
		}
		
	}

}
