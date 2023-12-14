import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>1){
            //1칸 점프 이동
            if(n%2 == 1)
                answer++;
            n = n/2;
        }
        //0에서 1로 갈 때는 무조건 점프!
        answer++;
        
        return answer;
    }
}