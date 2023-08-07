package programmers;

public class JadenCode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("1HELLO 1WORLD");
    }
}
class Solution{
    public String solution(String s) {
        String[] arrs = s.split(" ");
        String answer = "";
        for(int i=0; i<arrs.length; i++) {
            arrs[i] = arrs[i].toLowerCase();
            String[] words = arrs[i].split("");
            char[] a = words[0].toUpperCase().toCharArray();
            arrs[i] = arrs[i].replace(arrs[i].charAt(0), a[0]);
            answer += arrs[i];
            if(i != arrs.length - 1) answer += " ";
        }
        System.out.println(answer);
        return answer;
    }
}