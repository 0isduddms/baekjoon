package Backjoon.ifwhile;

import java.util.Scanner;

public class n1110 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("");
		int firnum = scan.nextInt();					//입력한 숫자
		int num10;										//숫자의 십의 자리
		int num1;										//숫자의 일의자리
		int midnum=firnum;
		int i = 1;
				
		for(; i>0 ; i++) {
			num10 = midnum / 10;
			num1 = midnum % 10;
			midnum = num10 + num1;
			if (midnum>=10) {
				midnum = midnum % 10;
			}
			
			midnum = num1*10+midnum;
			if(midnum == firnum) {
				break;
			}
		}
		System.out.println(i);
		scan.close();
	}
}