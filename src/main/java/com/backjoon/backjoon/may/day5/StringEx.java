package com.backjoon.backjoon.may.day5;

import java.util.Scanner;
// May.2 Tuesday
public class StringEx {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				String a = sc.next();

				String[] str = a.split("");
				for (int i = 0; i < str.length; i++) {
						System.out.printf("%s\n", str[i]);
				}
		}
}
