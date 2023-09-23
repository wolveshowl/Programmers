class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] alp = s.toCharArray();

        for(int i = 0; i < alp.length; i++){
            if(alp[i] == ' ') answer += ' ';
            else if(Character.isUpperCase(alp[i])) {
                int temp = (int)alp[i] + n;
                if(temp > 90) answer += (char)(temp - 26);
                else answer += (char)temp;
            }else{
                int temp = (int)alp[i] + n;
                if(temp > 122) answer += (char)(temp - 26);
                else answer += (char)temp;
            }
        }
        return answer;
    }
}