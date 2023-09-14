import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).map(str -> builder.append(str)).collect(Collectors.toList());
        return builder.toString();
    }
}