class Solution {
    public int solution(int price) {
        double percent = 0;
        
        if (price >= 500000) percent = 2;
        
        else if (300000 <= price && price < 500000) percent = 1;
        else if (100000 <= price && price < 300000) percent = 0.5;
        
        return (int)Math.floor(price - (price * (percent * 0.1)));
    }
}