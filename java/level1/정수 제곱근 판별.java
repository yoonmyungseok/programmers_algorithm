class Solution {
    public long solution(long n) {
        long answer = 0;
        for(long x=1; x<n+1; x++){
            if((n%x)==0){
                if(n==(x*x)){
                    answer=(long)Math.pow(x+1,2);
                    break;
                }
            }else{
                answer=-1;
            }
        }
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
