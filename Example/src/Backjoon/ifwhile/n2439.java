package Backjoon.ifwhile;

import java.util.Scanner;

public class n2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		
		for (int h = 1; h < (num+1); h++ ) {
			int j=0;
			
			for(int i = num - h; i > 0; i--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= h; k++ ) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		scan.close();
	}
}