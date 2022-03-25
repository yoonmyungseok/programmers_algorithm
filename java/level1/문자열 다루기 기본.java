class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=48&&s.charAt(i)<=57)&&(s.length()==4||s.length()==6)){
                answer=true;
            }else{
                answer=false;
                break;
            }  
        }
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
