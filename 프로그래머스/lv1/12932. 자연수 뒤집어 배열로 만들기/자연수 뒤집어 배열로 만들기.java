class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(str.charAt(str.length() - i - 1)));
        }
        return answer;
    }
}