class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) answer += s.charAt((s.length() / 2) - 1);
        return answer += s.charAt(s.length() / 2);
    }
}