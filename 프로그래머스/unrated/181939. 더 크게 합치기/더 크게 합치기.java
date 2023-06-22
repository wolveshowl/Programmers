class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aTob = String.valueOf(a) + String.valueOf(b);
        String bToa = String.valueOf(b) + String.valueOf(a);
        answer = Integer.parseInt(aTob) < Integer.parseInt(bToa) ? Integer.parseInt(bToa) : Integer.parseInt(aTob);
        return answer;
    }
}