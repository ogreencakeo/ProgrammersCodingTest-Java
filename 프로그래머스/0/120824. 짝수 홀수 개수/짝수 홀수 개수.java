class Solution {
    public int[] solution(int[] num_list) {
        int[] cntArr = new int[]{0, 0};
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2==0){
                ++cntArr[0];
            }else{
                ++cntArr[1];
            }
        }
        return cntArr;
    }
}