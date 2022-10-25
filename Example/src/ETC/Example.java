package ETC;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		boolean pos = true;
		
		while (pos) {
			System.out.print("양의 정수를 입력하세요 : ");
			int num = scan.nextInt();
			
			if(num > 0) {
				if (num % 2 == 0) {
					sum += num;
				}
			}
			else pos = false;
		}
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 :  " + sum);
		scan.close();
	}
}