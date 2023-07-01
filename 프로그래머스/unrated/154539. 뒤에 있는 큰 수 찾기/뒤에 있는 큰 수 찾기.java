import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> st = new Stack<Integer>();
        
        int[] answer = new int[numbers.length];
        for (int i=numbers.length-1; i>=0; i--) {
            int number = numbers[i];
            answer[i] = -1;
            while (!st.empty()) {
                int top = st.peek();
                if (top > number) {
                    answer[i] = top;
                    break;
                }
                st.pop();
            }
            st.add(number);
        }
        return answer;
    }
}