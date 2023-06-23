class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int length = 0;
        
        for (int i = 0; i < section.length; i++) {
            if(length <= section[i]) {
                length = section[i] + m;
                answer++;
            }
        }
        return answer;
    }
}