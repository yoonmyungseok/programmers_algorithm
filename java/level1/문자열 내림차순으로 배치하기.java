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
