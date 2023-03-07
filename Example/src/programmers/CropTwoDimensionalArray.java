package programmers;

import java.util.Arrays;

/*
 * 정수 n, left, right가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.

	n행 n열 크기의 비어있는 2차원 배열을 만듭니다.
	i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
	1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
	1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
	새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
	정수 n, left, right가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.
	[1, 2, 3]
	[2, 2, 3]
	[3, 3, 3]
 */

public class CropTwoDimensionalArray {

	public static void main(String[] args) {
		int n = 3;
		long left = 2;
		long right = 5;
		
		Crop c = new Crop();
		c.solution(n, left, right);
	}
}

class Crop {
	public int[] solution(int n, long left, long right) {
//		// n*n 크기의 2차원 배열
//        int ta[][] = new int[n][n];
//        // n*n 크기의 1차원 배열
//        int arr[] = new int[n*n];
//        int b = 0;
//		int answer[] = new int[(int) (right - left + 1)];
//		
//		for(int i = 0; i < ta.length; i++) {
//			int a = i + 1;
//			for(int j = 0; j < ta.length; j++) {
//				if(j <= a - 1) {
//					ta[i][j] = a;
//				}
//				else {
//					a++;
//					ta[i][j] = a;
//				}
//			}
//		}
//		//2차원 배열 출력
//		System.out.println(Arrays.toString(ta[0]));
//		System.out.println(Arrays.toString(ta[1]));
//		System.out.println(Arrays.toString(ta[2]));
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				arr[ta[i].length * i + j] = ta[i][j];
//			}
//		}
//		
//		// 1차원 배열 출력
//		System.out.println(Arrays.toString(arr));
//		
//		for(long k = left; k <= right; k++) {
//			answer[b] = arr[(int) k];
//			b++;
//		}
//		
//		System.out.println(Arrays.toString(answer));
//		
//        return answer;
		int[] answer = new int[(int)(right - left + 1)];
        for (int i = 0; i < answer.length; i++) {
            int y = (int)(left / n + 1);
            int x = (int)(left % n + 1);
            left++;
            answer[i] = Math.max(y, x);
        }
        
        System.out.println(Arrays.toString(answer));

        return answer;
      }
}