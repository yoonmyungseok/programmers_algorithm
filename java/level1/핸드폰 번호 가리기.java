class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] ch=new char[phone_number.length()];
        for(int i=0;i<ch.length;i++){
            if(i<ch.length-4){
                ch[i]='*';
            }else{
                ch[i]=phone_number.charAt(i);
            }
        }
        answer=String.valueOf(ch);
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
