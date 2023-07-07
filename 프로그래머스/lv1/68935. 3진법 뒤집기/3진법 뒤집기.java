class Solution {
    public int solution(int n) {
        String answer = "";
        for (int i = 0; i < Integer.toString(n, 3).length(); i++) {
            answer += String.valueOf(Integer.toString(n, 3).charAt(Integer.toString(n, 3).length() - 1 - i));
        }
        return Integer.parseInt(answer, 3);
    }
}