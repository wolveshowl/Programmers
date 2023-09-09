class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(Math.max(sides[0], sides[1]), sides[2]);
        for (int i = 0; i < sides.length; i++) {            
            answer += sides[i];            
        }
        return answer = answer - max > max ? 1 : 2;
    }
}