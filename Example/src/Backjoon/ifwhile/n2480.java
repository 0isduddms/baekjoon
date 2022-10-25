package Backjoon.ifwhile;

import java.util.Scanner;

public class n2480 {

	public static void main(String[] args) {
		int price;
		Scanner scan = new Scanner(System.in);

		System.out.print("");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 == num2) {								//첫번째 눈금과 두번째 눈금이 같을 때
			if(num2 == num3) {							//눈금 3개가 같을 때
				price = num1 * 1000 + 10000;
			}
			else {												//첫번째 눈금과 두번째 눈금만 같을 때
				price = num1 * 100 + 1000;
				}
			}
		else if (num2 == num3) {					//두번째 눈금과 세번째 눈금이 같을 때
			price = num2 * 100 + 1000;
		}
		else if(num1 == num3) {					//첫번째 눈금과 세번째 눈금이 같을 때
			price = num1 * 100 + 1000;
		}
		else {												//모든 눈금이 다를 때
			if (num1 > num2) {						//첫번째 눈금이 두번째 눈금보다 크고
				if(num1 > num3) {					//첫번째 눈금이 세번째 눈금보다 클때(첫번째 눈금이 가장 클 때)
					price = num1 * 100;
				}
				else {										//세번째 눈금이 가장 클 때
					price = num3 * 100;
				}
			}
			else { 										//두번째 눈금이 첫번째 눈금보다 크고
				if (num2 > num3) {					//세번째 눈금보다 클 때 (두번째 눈금이 더 클때)
					price = num2 * 100;
				}
				else {
					price = num3 * 100;
				}
			}
		}
		
		System.out.print(price);
		
		scan.close();

	}

}