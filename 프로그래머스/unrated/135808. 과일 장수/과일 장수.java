import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);                                    
        for(int i=score.length-1; i>=m-1; i-=m) {              
            int[] temp = new int[m];                           
            for(int j=i, l=0; j>i-m; j--, l++) {
                temp[l] = score[j];                            
            }
            int min = Arrays.stream(temp).min().getAsInt();    
            answer += min * m;
        }
        return answer;
    }
}