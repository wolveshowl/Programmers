class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 1. 입력 데이터 중 큰 값을 a, 작은 값을 b에 저장.
        int a = n>=m ? n : m;
        int b = n<m ? n : m;
        // 1-1. 데이터 저장을 위한 임시 변수.
        int temp;
        
        // 2. 큰 수 % b가 0이 될 때 까지 반복.
        while(a % b != 0 ){
            // 2-1. 큰 수를 임시저장.
            temp = a;
            // 2-2. 작은 수를 큰 수 변수로 저장.
            a = b;
            // 2-3. 기존의 큰 수인 temp % b를 작은 수로 저장.
            b = temp % b;            
        }
        
        // 3. a % b == 0 일 때, b가 두 수의 최대공약수, 두 수의 곱을 최대공약수로 나눈 것이 최소공배수
        answer[0] = b;
        answer[1] = (n * m) / b;
        
        return answer;
    }
}