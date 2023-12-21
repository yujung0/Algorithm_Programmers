class Solution {
    public int solution (int a, int b) {
        
        int plusCase = Integer.valueOf((String.valueOf(a) + String.valueOf(b)));
        int multipleCase = 2 * a * b;
        return plusCase > multipleCase ? plusCase : multipleCase;
            
        
        }
}

