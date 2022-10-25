package Backjoon.ifwhile;

import java.util.Scanner;

public class n25304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		int price = scan.nextInt();  //x
		System.out.print("");
		int num = scan.nextInt();	//n
		int totprice = 0;			//sum
		
		for (int i = 0; i < num; i++) {
			System.out.print("");
			int indprice = scan.nextInt();	//a
			int thing = scan.nextInt();		//b
			
			totprice += indprice * thing;
		}
		if (totprice == price) {
			System.out.print("Yes");
		}
		else System.out.print("No");
		scan.close();
	}
}
