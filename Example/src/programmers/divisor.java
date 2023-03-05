package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class divisor {

	public static void main(String[] args) {
		int n = 24;
		Div div = new Div();
		div.solution(n);

	}

}

class Div {
	public int[] solution(int n) {
		List<Integer> nums = new ArrayList<Integer>();
        int[] answer = {};
        
        // 1과 자기 자신을 리스트에 추가한다. n = 1일때는 1이 중복되므로 걸러줌
        nums.add(1);
        if(n != 1) nums.add(n);
        
        // 나머지가 0일때 나누는 수를 리스트에 추가한다.
        for(int i = 2; i <= n / 2; i++) {
        	if(n % i == 0) {
        		nums.add(i);
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