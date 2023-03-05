package programmers;

import java.util.ArrayList;
import java.util.List;

public class ClawMachine {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		Claw claw = new Claw();
		claw.solution(board, moves);

	}

}

class Claw {
	public int solution(int[][] board, int[] moves) {
		List<Integer> basket = new ArrayList<Integer>();
        int answer = 0;
        
        // 열 선택
        for(int i = 0; i < moves.length; i++) {
        	// 크레인을 내린다(행)
        	for(int j = 0; j < board.length; j++) {
        		if(board[j][moves[i] - 1] != 0) {		// 빈칸이 아니면
        			basket.add(board[j][moves[i] - 1]); // 인형을 바구니에 넣는다.
        			board[j][moves[i] - 1] = 0;			// 그로인해 빈칸이 생성됨
	        		if(basket.size() > 1) {	// 두번째 뽑을 때부터 인형 비교를 함
	        			// 마지막으로 뽑은 인형과 그 전에 뽑은 인형이 같은 경우 인형 삭제
	        			if(basket.indexOf(basket.get(basket.size() - 1)) == basket.indexOf(basket.get(basket.size() - 2))) {
	        				basket.remove(basket.get(basket.size() - 1));
	        				basket.remove(basket.get(basket.size() - 1));
	        				answer += 2;
	        			}
	        		}
	        		
	        		break;
        		}
        		
        	}
        }
        System.out.println(answer);
        System.out.println(basket);
        
        return answer;
    }
}