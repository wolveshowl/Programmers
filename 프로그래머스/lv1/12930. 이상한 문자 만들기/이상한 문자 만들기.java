class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
		
		String[] arr = s.split("");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(" ")) { 
				idx = 0;
			} else {
				if(idx % 2 == 0) { 
					idx++;
					arr[i] = arr[i].toUpperCase();
				} else { 
					idx++;
					arr[i] = arr[i].toLowerCase();
				}
			}
			answer += arr[i];
		}
        return answer;
    }
}