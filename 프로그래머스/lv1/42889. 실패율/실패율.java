import java.util.*;
import java.lang.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        
        double[] percentage = new double [N];
        double[] tmpArr = new double [N];
        
        double tmp = stages.length;
        double cnt = 0;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i+1){
                    cnt++;
                }
            }
            
            percentage[i] = cnt/tmp;
            tmpArr[i] = cnt/tmp;
            
            if(cnt == 0 && tmp == 0){
                percentage[i] = 0;
                tmpArr[i] = 0;
            }
            
            tmp -= cnt;
            cnt = 0;
        }
        
        Arrays.sort(percentage);
        
        for(int i = percentage.length-1; i >= 0; i--){
            for(int j = 0; j < tmpArr.length; j++){
                if(percentage[i] != -1 && percentage[i] == tmpArr[j]){
                    answer[percentage.length-1-i] = j+1;
                    percentage[i] = -1;
                    tmpArr[j] = -1;
                }
            }
        }
        
        return answer;
    }
}