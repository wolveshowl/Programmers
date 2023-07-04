class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = 0;

        while (true) {
            if (n == x * x) {
                answer = (x+1) * (x+1);
                break;
            }
            if (n < x * x) {
                answer = -1;
                break;
            }
            x++;
        }
        return answer;
    }
}