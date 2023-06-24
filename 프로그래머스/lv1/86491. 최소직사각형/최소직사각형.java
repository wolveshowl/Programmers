class Solution {
    public int solution(int[][] sizes) {
        int widthMax = 0;
        int heightMax = 0;
        
        for (int[] size : sizes) {
            
            int tmpWidth = Math.max(size[0], size[1]);
            int tmpHeight = Math.min(size[0], size[1]);
            
            if (tmpWidth > widthMax) widthMax = tmpWidth;
            if (tmpHeight > heightMax) heightMax = tmpHeight; 
        }
        
        return widthMax * heightMax;
    }
}