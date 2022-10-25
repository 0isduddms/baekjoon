package Backjoon.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int times = Integer.parseInt(str);
		
		int location;
		for (int i = 0; i < times; i++) {
			StringTokenizer st;
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			double dis = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
			int max = (int)dis;
			if(max < r1 && r2 < r1)
				max = r1;
			else (max < r2 && r1 < r2)
				max = r2;
			
				
			if(r1 + r2 > Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1))){
				location = 2;
				System.out.println(location);
			}
			else if(r1 + r2 == Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1))){
				location = 1;
				System.out.println(location);
			}
			else if (x1 == x2 && y1 == y2 && r1 == r2){
				location = -1;
				System.out.println(location);
			}
			else {
				location = 0;
				System.out.println(location);
			}
		}
		br.close();
		
	}
}
