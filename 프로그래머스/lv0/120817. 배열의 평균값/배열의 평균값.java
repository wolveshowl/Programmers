import java.lang.*;
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return (double)answer / numbers.length;
    }
}