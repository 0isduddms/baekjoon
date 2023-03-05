package programmers;

public class Thesis {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		Th th = new Th();
		th.solution(citations);

	}

}

class Th {
	public int solution(int[] citations) {
		int up = 0, down = 0, answer = 0;
        
        // citations[i]가 열람 횟수보다 많으면 up 증가, 아니면 down 증가
    	for(int times = citations.length; times > 0; times--) {
    		for(int i = 0; i < citations.length; i++) {
    			if(times <= citations[i]) up++;
    			else down++;
    		}
    		// times보다 up이 많거나 같고 times보다 down이 적거나 같으면 answer에 대입 후 for문 종료
    		if(times <= up && times >= down) { answer = times; break; }
    		// 아니라면 up과 down 초기화
    		else { up = 0; down = 0; }
    	}
    	
        return answer;
    }
}