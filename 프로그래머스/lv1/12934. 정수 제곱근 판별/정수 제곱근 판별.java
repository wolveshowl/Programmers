class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = 1;

        while (n >= x * x) {
            if (n == x * x) {
                answer = (x+1) * (x+1);
                break;
            }
            x++;
        }
        
        return answer = answer == 0 ? -1 : answer;
    }
}