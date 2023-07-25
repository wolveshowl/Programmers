import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        return Arrays.stream(strings).sorted(Comparator.comparing(s -> s.charAt(n))).collect(Collectors.toList()).toArray(new String[strings.length]);
    }
}