package Backjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int sz = Integer.parseInt(st);
		String ox = "";
		int subscore = 1;
		int fiscore = 0;
		
		for (int i = 0; i < sz; i++) {
			ox = br.readLine();
			fiscore = 0;
			subscore = 1;
			
			for (int j = 0; j < ox.length(); j++) {
				if (j == 0) {
					if (ox.charAt(j) == 'X')
						subscore = 1;
					else if (ox.charAt(j) == 'O')
						fiscore = fiscore + 1;
				}
				else {
					if (ox.charAt(j) == 'X')
						subscore = 1;
					else {
						if (ox.charAt(j-1) == 'O') {
							subscore = subscore + 1;
							fiscore = fiscore + subscore;
						}
						else 
							fiscore = fiscore + 1;
					}
				}
			}
			System.out.println(fiscore);
		}
		br.close();
	}
}
