class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        int doubleCount = 1;
        for (int i = 0; i < count; i++) {
            answer += (price * doubleCount);
            doubleCount++;
        }
        return answer = answer > money ? (answer-money) : 0;
    }
}