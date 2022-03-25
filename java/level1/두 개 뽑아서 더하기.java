import java.util.TreeSet;
import java.util.Set;
class Solution {
    public Set<Integer> solution(int[] numbers) {
        Set<Integer> answer=new TreeSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                answer.add(numbers[i]+numbers[j]);
            }
        }
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
