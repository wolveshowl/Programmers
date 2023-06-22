class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum = String.valueOf(a) + String.valueOf(b);
        int mul = 2 * a * b;
        
        answer = mul > Integer.parseInt(sum) ? mul : Integer.parseInt(sum);
        return answer;
    }
}