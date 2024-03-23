class Solution {
    public String solution(String my_string, String letter) {
        String result = "";
        char tg = letter.charAt(0);
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) != tg ){
                result += my_string.charAt(i);
            }
        }
        return result;
    }
}