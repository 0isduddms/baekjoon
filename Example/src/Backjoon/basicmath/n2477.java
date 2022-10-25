package Backjoon.basicmath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n2477 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int[][] fm = new int[6][2];
		int fruit = Integer.parseInt(st.nextToken());
		int width = 0;
		int height = 0;
		int fs = 0;
		
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			int forward = Integer.parseInt(st.nextToken());
			int meter = Integer.parseInt(st.nextToken());
			fm[i][0] = forward;
			fm[i][1] = meter;
			
			if(fm[i][0] == 4)
				height += fm[i][1];
			else if (fm[i][0] == 1)
				width += fm[i][1];
		}
		
		for(int i = 0; i < 6; i++) {
			if (i == 5) {
				if (fm[0][0] == 1 && fm[5][0] == 4) {
					fs = (height * width) - (fm[0][1] * fm[5][1]);
					break;
				}
				else if (fm[0][0] == 2 && fm[5][0] == 3) {
					fs = (height * width) - (fm[0][1] * fm[5][1]);
					break;
				}
				else if (fm[0][0] == 3 && fm[5][0] == 1) {
					fs = (height * width) - (fm[0][1] * fm[5][1]);
					break;
				}
				else if (fm[0][0] == 4 && fm[5][0] == 2) {
					fs = (height * width) - (fm[0][1] * fm[5][1]);
					break;
				}
				
			}
			else {
				if (fm[i][0] == 1 && fm[i+1][0] == 3) {
					fs = (height * width) - (fm[i][1] * fm[i+1][1]);
					break;
				}
				else if (fm[i][0] == 2 && fm[i+1][0] == 4) {
					fs = (height * width) - (fm[i][1] * fm[i+1][1]);
					break;
				}
				else if (fm[i][0] == 3 && fm[i+1][0] == 2) {
					fs = (height * width) - (fm[i][1] * fm[i+1][1]);
					break;
				}
				else if (fm[i][0] == 4 && fm[i+1][0] == 1) {
					fs = (height * width) - (fm[i][1] * fm[i+1][1]);
					break;
				}
			}
		}
		System.out.println(fs * fruit);
		br.close();
	}
}