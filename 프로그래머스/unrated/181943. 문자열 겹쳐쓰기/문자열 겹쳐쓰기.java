class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // return answer;
        
        int I = overwrite_string.length();
        int I2 = my_string.length();

        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+I, I2);
        return answer;
        
        }
    }
