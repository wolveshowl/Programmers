import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
         List<Integer> list = new ArrayList<>();
        Map<String, LocalDate> map = new HashMap<>();

        //terms에 나온 값을 today 기준으로 값을 빼줍니다.
        for (String str : terms) {
            String key = str.split(" ")[0];
            String value = str.split(" ")[1];

            LocalDate date = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyy.MM.dd"));
            date = date.minusMonths(Long.parseLong(value)).plusDays(1);

            //map에 term에 나온 약관 종류 별로 저장합니다.
            map.put(key, date);
        }

        //privacies에 나온 값을 기준으로 저장된 map의 값과 비교해 이전이면 파기합니다.
        for (int i = 0; i < privacies.length; i++) {
            LocalDate date = LocalDate.parse(privacies[i].split(" ")[0],
                    DateTimeFormatter.ofPattern("yyy.MM.dd"));

            String key = privacies[i].split(" ")[1];
            if (map.get(key).isAfter(date)) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    
    }
}