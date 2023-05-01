package com.backjoon.backjoon.may.day4;

import java.util.Scanner;
// May.1 Monday
public class BackJoon2525 {
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int inputHour = sc.nextInt();
				int inputMinute = sc.nextInt();
				int inputAddNum = sc.nextInt();

				int minutesNum = 60 * inputHour + inputMinute; // 1,060[60 * inputHour + inputMinute]

				minutesNum += inputAddNum; // 1060 + 80

				int resultHours = (minutesNum / 60) % 24; // 1140 / 60 => 19
				int resultMinutes = minutesNum % 60; // 1140 % 60 => 0

				System.out.printf("%d %d\n", resultHours, resultMinutes); // 19 0
		}
}
