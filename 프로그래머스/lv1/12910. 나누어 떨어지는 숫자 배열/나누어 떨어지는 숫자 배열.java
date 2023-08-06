import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0 && arr[i] >= divisor) {
                if (arr[i] % divisor == 0) list.add(arr[i]);                
            }
            
        }
        
        return list.size() != 0 ? list.stream().sorted().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }
}