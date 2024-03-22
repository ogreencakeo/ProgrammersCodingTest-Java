class Solution {
    public int solution(int n, int k) {
        int service = n / 10 * 2000;
        int lam_price = n * 12000;
        int drinking_price = k * 2000;
        
        int totalPrice = lam_price + drinking_price - service;
        
        return totalPrice;
    }
}