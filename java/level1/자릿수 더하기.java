class Solution {
    public int solution(int n) {
        int answer = 0;
        String str=Integer.toString(n);
        for(int i=0; i<str.length(); i++){
            answer+=(str.charAt(i)-48);
        }
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
