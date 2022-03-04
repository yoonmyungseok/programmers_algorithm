class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0){
            answer=s.substring(s.length()/2-1,s.length()/2+1);
        }else{
            answer=s.substring(s.length()/2,s.length()/2+1);
        }
        return answer;
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
