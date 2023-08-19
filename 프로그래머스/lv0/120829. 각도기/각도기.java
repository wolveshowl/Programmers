class Solution {
    public int solution(int angle) {
        int answer = 0;
        System.out.println(angle);
        return answer = angle < 90 ? 1 : (angle == 180) ? 4 : (angle == 90) ? 2 : 3;
    }
}