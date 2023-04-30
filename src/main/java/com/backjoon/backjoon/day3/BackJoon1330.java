package com.backjoon.backjoon.day3;

import java.util.Scanner;
// April.30 Sunday
public class BackJoon1330 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputStrOne = sc.nextInt();
				int inputStrTwo = sc.nextInt();

				if (inputStrOne > inputStrTwo) {
						System.out.println(">");
				} else if (inputStrOne < inputStrTwo) {
						System.out.println("<");
				} else if (inputStrOne == inputStrTwo) {
						System.out.println("==");
				}

				sc.close();
		}
}
