package com.backjoon.backjoon.day3;

import java.util.Scanner;
// April.30 Sunday
public class BackJoon9498 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputScore = sc.nextInt();

				if (inputScore >= 0 && inputScore <= 100) {
						if (inputScore <= 100 && inputScore >= 90) {
								System.out.println("A");
						} else if (inputScore <= 89 && inputScore >= 80) {
								System.out.println("B");
						} else if (inputScore <= 79 && inputScore >= 70) {
								System.out.println("C");
						} else if (inputScore <= 69 && inputScore >= 60) {
								System.out.println("D");
						} else {
								System.out.println("F");
						}
				}
				sc.close();
		}
}
