class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch (ineq) {
            case "<" :
                switch (eq) {
                    case "=":
                        answer = n <= m ? 1 : 0;
                        break;
                    case "!":
                        answer = n < m ? 1 : 0;
                        break;
                }
                break;
            case ">" :
                switch (eq) {
                    case "=":
                        answer = n >= m ? 1 : 0;
                        break;
                    case "!":
                        answer = n > m ? 1 : 0;
                        break;
                }
                break;
        }
        return answer;
    }
}