package com.backjoon.backjoon.day3;

import java.util.Scanner;
// April.30 Sunday
public class BackJoon2884 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputHour = sc.nextInt();
				int inputMinute = sc.nextInt();

				int alramSetting = 45;


				if (inputMinute < alramSetting) {
						inputHour--;
						inputMinute = 60 - (alramSetting - inputMinute);
						if (inputHour < 0) {
								inputHour = 23;
						}
						System.out.printf("%d %d\n", inputHour, inputMinute);
				} else {
						System.out.printf("%d %d\n", inputHour, (inputMinute - alramSetting));
				}
		}
}
