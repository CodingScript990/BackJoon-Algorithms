package com.backjoon.backjoon.day2;

import java.util.Scanner;

// April.29 Saturday
public class BackJoon10430 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputOne = sc.nextInt();
				int inputTwo = sc.nextInt();
				int inputThird = sc.nextInt();

				sc.close();

				int resultOne = (inputOne + inputTwo) % inputThird;
				int resultTwo = ((inputOne % inputThird) + (inputTwo % inputThird)) % inputThird;
				int resultThird = (inputOne * inputTwo) % inputThird;
				int resultFour = ((inputOne % inputThird) * (inputTwo % inputThird)) % inputThird;

				System.out.printf("%d\n", resultOne);
				System.out.printf("%d\n", resultTwo);
				System.out.printf("%d\n", resultThird);
				System.out.printf("%d\n", resultFour);
		}
}
