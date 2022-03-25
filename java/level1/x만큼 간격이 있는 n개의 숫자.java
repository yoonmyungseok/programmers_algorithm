class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n; i++){
            answer[i]=x*(i+1);
        }
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
