package programmers;

/*
 * 1번 지표	라이언형(R), 튜브형(T)
 * 2번 지표	콘형(C), 프로도형(F)
 * 3번 지표	제이지형(J), 무지형(M)
 * 4번 지표	어피치형(A), 네오형(N)
 * 
 * 1	매우 비동의 + 3
 * 2	비동의 + 2
 * 3	약간 비동의 + 1
 * 4	모르겠음
 * 5	약간 동의 + 1
 * 6	동의 + 2
 * 7	매우 동의 + 3
 */

public class MBTI {

	public static void main(String[] args) {
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7, 1, 3};
		
		MB mb = new MB();
		mb.solution(survey, choices);

	}

}

class MB {
	int score[] = new int[8];
    // R, T, C, F, J, M, A, N 순
	
	public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        for (int i = 0; i < survey.length; i++) {
        	
        	// 비동의 영역의 문자
        	char disagree = survey[i].charAt(0);
        	// 동의 영역의 문자
            char agree = survey[i].charAt(1);
            
            // 답변 케이스
        	switch (choices[i]) {
			case 1:
				addscore(disagree, 3);
				break;
			case 2:
				addscore(disagree, 2);
				break;
			case 3:
				addscore(disagree, 1);
				break;
			case 5:
				addscore(agree, 1);
				break;
			case 6:
				addscore(agree, 2);
				break;
			case 7:
				addscore(agree, 3);
				break;
			
			}
        }
        
        // 점수에 따라 답변에 문자를 추가한다.
        answer += score[0] >= score[1] ? 'R' : 'T';
        answer += score[2] >= score[3] ? 'C' : 'F';
        answer += score[4] >= score[5] ? 'J' : 'M';
        answer += score[6] >= score[7] ? 'A' : 'N';
        
        System.out.println(answer);
        
        return answer;
    }

	// 비동의 혹은 동의 영역의 문자와 점수를 받아서 케이스에 따라 각 배열에 점수를 더한다.
	private void addscore(char consent, int i) {
		switch (consent) {
		case 'R':
			score[0] += i;
			break;
		case 'T':
			score[1] += i;
			break;
		case 'C':
			score[2] += i;
			break;
		case 'F':
			score[3] += i;
			break;
		case 'J':
			score[4] += i;
			break;
		case 'M':
			score[5] += i;
			break;
		case 'A':
			score[6] += i;
			break;
		case 'N':
			score[7] += i;
			break;
		
		}
		
	}
	
}