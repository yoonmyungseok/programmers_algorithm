import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);  
        }
        Arrays.sort(ch);
        for(int i=0;i<s.length();i++){
            answer+=ch[s.length()-i-1];
        }
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
