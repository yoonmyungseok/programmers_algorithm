class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2==1){
            n=n-1;
        }
        while(n>1){
            answer=answer+n;
            n=n-2;
        }
        return answer;
    }
}