class Solution {
    public String solution(String my_string, String letter) {
        char tg = letter.charAt(0);
        String result = "";
        
        for(char ch : my_string.toCharArray()){
            if(tg != ch){
                result += ch;
            }
        }
        return result;
    }
}