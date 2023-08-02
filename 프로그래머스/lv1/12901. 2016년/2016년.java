class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] lastDaysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int date = 0;
        for (int i = 0; i < a-1; i++) {
            date += lastDaysOfMonth[i];
        }
        date += b - 1;
        
        return answer = week[date % 7];
    }
}