package Backjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		if (x < 8) {
			if (x % 3 != 0 || x % 5 != 0) {
				System.out.println(-1);
			}
			else {
				
			}
		}

	} 

}
