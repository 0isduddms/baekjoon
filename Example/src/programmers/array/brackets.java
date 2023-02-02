package programmers.array;

public class brackets {

	public static void main(String[] args) {
		String s = "()))((()";
		
		Solution sol = new Solution();
		
		Boolean result = sol.solution(s);
		
		System.out.println(result);
	}
}
class Solution {
	boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        
        int i = 0, fi = 0, bi = 0, r = 0;
        
        if(arr[0] == ')') {
        	answer = false;
        }
        else {
	        while(i < arr.length) {
	        	if(i > arr.length) break;
	        	if(arr[i] == '(') {
	        		r++;
	        		System.out.println(arr[i]);
	        		i++;
	        		
	        	}
	        	else {
	        		r--;
	        		System.out.println(arr[i]);
	        		i++;
	        		
	        	}
	        	
	        	if (i < arr.length-1) {
	        		if(arr[i + 1] == '(') {
		        		if(r < 0) {
		        			answer = false;
		        			System.out.println(answer);
		        			break;
		        		}
	        		}
	        	}
	        	System.out.println(i);
	        	if(arr[arr.length - 1] == '(' || r != 0) {
	        		answer = false;
	        	}
	        	else if (r == 0) {
	        		answer = true;
	        	}
	        	
        	}
	        
        }
        return answer;
    }
}