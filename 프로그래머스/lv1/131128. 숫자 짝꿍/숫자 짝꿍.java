import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> mapX = new HashMap<>();
        Map<String, Integer> mapY = new HashMap<>();
        
        for(String s : X.split("")){
            mapX.put(s,mapX.getOrDefault(s,0)+1);
        }

        for(String s : Y.split("")){
            mapY.put(s,mapY.getOrDefault(s,0)+1);
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i=9;i>=0;i--){
            int tmp = 
                Math.min(mapX.getOrDefault(i+"",0),mapY.getOrDefault(i+"",0));
            for(int j=0;j<tmp;j++) answer.append(i+"");
        }
        
        if(answer.length()==0){
            return "-1";
        }
        if(answer.charAt(0)=='0'){
            return "0";
        }
        
        return answer.toString();
    }
}