package com.backjoon.backjoon.april.day3;

import java.util.Scanner;
// April.30 Sunday
public class BackJoon2753 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputYear = sc.nextInt();

				if (inputYear >= 1 && inputYear <= 4000) {
						if (inputYear % 4 == 0) {
								if (inputYear % 400 != 0 && inputYear % 100 == 0) {
										System.out.println(0);
								} else {
										System.out.println(1);
								}
						} else {
								System.out.println(0);
						}
				}
				sc.close();
		}
}
