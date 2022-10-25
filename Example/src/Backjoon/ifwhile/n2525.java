package Backjoon.ifwhile;

import java.util.Scanner;

public class n2525 {

	//첫번째 줄에 현재 시간을 입력하고 두번째 줄에 소요시간 입력하면 종료되는 시간과 분이 출력된다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		int hour = scan.nextInt();
		int min = scan.nextInt();
		System.out.print("");
		int time = scan.nextInt();
		int mintime = min + time;
		
		hour = time / 60 + hour;
		min = time % 60 + min;
		if (min > 59) {
			min = min % 60;
			hour += 1;
		}
		if (hour > 23) {
			hour = hour - 24;
		}
		System.out.printf("%d %d", hour, min);
		scan.close();
	}

}
