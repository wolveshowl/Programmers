class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int temp = 0;
                    temp = nums[i] + nums[j] + nums[k];
                    if (isPrimeNumber(temp)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    private static boolean isPrimeNumber(int n) {
        if (n < 2) return false;
        if (n == 2) return true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}