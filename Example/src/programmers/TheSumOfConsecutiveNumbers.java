package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다.
//연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

public class TheSumOfConsecutiveNumbers {

	public static void main(String[] args) {
		int num = 4;
		int total = 14;
		Sum sum = new Sum();
		sum.solution(num, total);
		
	}

}

class Sum {
	public int[] solution(int num, int total) {
		int A = 1;
		List<Integer> nums = new ArrayList<Integer>();
		int[] answer = {};
        
        if(num % 2 != 0) {
        	int center = total/num;
        	nums.add(center); // 중앙값을 넣어줌
        	for(int i = 0; i < (num - 1)/2; i++) {
        		nums.add(center - A);
        		nums.add(center + A);
        		A += 1;
        	}
        }
        else {
        	float cen = (float)total/(float)num;
        	for(int i = 0; i < num / 2; i++) {
        		nums.add((int) (cen - (float)(0.5 * A)));
        		nums.add((int) (cen + (float)(0.5 * A)));
        		A += 2;
        	}
        }
        
        // 오름차순으로 정렬
        nums.sort(Comparator.naturalOrder());
        // ArrayList를 Array로 변환
        answer = nums.stream().mapToInt(i->i).toArray();
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}