import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();        
        stack.push(0);
        
        for (int move: moves) {
            int column = move - 1;
            
            for (int row = 0; row < board.length; row++) {
                int doll = board[row][column];
                
                if (doll == 0) continue;
                else {
                    if (stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }
                    board[row][column] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}