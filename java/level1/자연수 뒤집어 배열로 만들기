class Solution {
    public long[] solution(long n) {
        int length=(int)Math.log10(n)+1;
        long[] answer = new long[length];
        for(int i=0; i<length; i++){
            long a=n/10;
            long b=n%10;
            n=a;
            answer[i]=b;
        }
        return answer;
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
