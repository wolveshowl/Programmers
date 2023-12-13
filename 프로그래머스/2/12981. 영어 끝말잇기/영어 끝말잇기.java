import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        Set<String> set = new HashSet<>(); // 중복된 단어 체크를 위한 Set

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char lastChar = (i == 0) ? word.charAt(0) : words[i - 1].charAt(words[i - 1].length() - 1);
            // 이전 단어의 마지막 글자

            if (set.contains(word) || word.charAt(0) != lastChar) { // 단어가 중복이거나 철자가 이어지지 않는 경우
                answer[0] = (i % n) + 1; // 번호
                answer[1] = (i / n) + 1; // 차례
                break;
            }

            set.add(word); // 사용한 단어 Set에 추가
        }

        return answer;
    }
}