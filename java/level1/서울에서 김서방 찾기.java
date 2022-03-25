class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String name="Kim";
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals(name)){
                answer="김서방은 "+i+"에 있다"; 
                break;
            }
        }
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
