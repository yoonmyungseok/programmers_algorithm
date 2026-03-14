class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = denom1 * numer2 + numer1 * denom2;
        int denom = denom1 * denom2;
        int maxNum = 1;
        
        for(int i=1; i <= numer && i<= denom; i++){
            if(numer%i==0 && denom%i==0){
                maxNum = i;
            }
        }
        answer[0] = numer/maxNum; 
        answer[1] = denom/maxNum; 
        
        return answer;
    }
}