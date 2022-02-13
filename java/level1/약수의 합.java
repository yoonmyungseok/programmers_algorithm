class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<n+1;i++){
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
