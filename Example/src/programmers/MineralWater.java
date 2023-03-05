package programmers;

public class MineralWater {
	public static void main(String[] args) {
		int left = 13;
		
		int right = 17;
		
		Solution1 sol = new Solution1();
		
		int result = sol.solution(left, right);
		
		System.out.println(result);
	}
}
class Solution1 {
    public int solution(int left, int right) {
        int MW = 0;
    	int answer = 0;
    	System.out.println(left/2);
    	System.out.println((float)left/2);
    	
    	for (int i = left; i <= right; i++) {
    		for (int j = 1; j <= i/2; j++) {
    			if (i % j == 0) {
    				MW++;
    			}
    		}
    		if ((MW + 1) % 2 == 0) {
    			answer += i;
    		}
    		else {
    			answer -= i;
    		}
    		MW = 0;
    	}
        
        return answer;
    }
}