package programmers;

public class MinMax {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		Solu sol = new Solu();
		
		System.out.println(sol.maxmin(s));
		
	}

}

class Solu{
    public String maxmin(String s) {
		// 공백을 사용하여 숫자들을 배열로 저장
        String[] numlist = s.split(" ");
		// parseInt 함수를 사용하여 문자열을 정수형으로 변환한 후 최댓값과 최솟값 초기화
		int min = Integer.parseInt(numlist[0]);
		int max = Integer.parseInt(numlist[0]);
		String answer = "";
				
		// for문을 사용하여 배열의 모든 원소와 비교
		for(int i = 0; i < numlist.length; i++) {
			int num = Integer.parseInt(numlist[i]);
					
			// i번째 숫자가 min보다 작으면 min으로 저장
			if(num < min) min = num;
			// i번째 숫자가 max보다 크면 max로 저장
			else if (num > max) max = num;
		}

		answer = min + " " + max;
		return answer;
	}
}
