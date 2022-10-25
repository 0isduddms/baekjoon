package Backjoon.ifwhile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n19637 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int titlenum = Integer.parseInt(st.nextToken());
		int usernum = Integer.parseInt(st.nextToken());
		
		String[] titlearr = new String[titlenum];
		int[] userarr = new int[titlenum];
		
		boolean istrue = true;
		
		for (int i = 0; i < titlenum; i++) {
			st = new StringTokenizer(br.readLine());
			String title = st.nextToken();
			int state = Integer.parseInt(st.nextToken());
			titlearr[i] = title;
			userarr[i] = state;
			System.out.println(titlearr[i]);
			System.out.println(userarr[i]);
		}
		
		for (int i = 0; i < usernum; i++) {
			st = new StringTokenizer(br.readLine());
			int userstate = Integer.parseInt(st.nextToken());
			while(istrue) {
				for (int j = 0; j < titlenum; j++) {
					if(j == 0) {
						 if((userstate >= 0) && (userstate <= userarr[j])) {
							 System.out.println(titlearr[j]);
							 istrue = false;
						 }
						 
					}
					else {
						if((userstate > userarr[j - 1]) && (userstate <= userarr[j])) {
							 System.out.println(titlearr[j]);
							 istrue = false;
						 }
					}
				}
			}
		}
		
		
		br.close();
	}

}
