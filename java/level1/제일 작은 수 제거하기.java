import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] result = arr.clone();
        int count=0;
        if(arr.length==1){
            int[] answer1={-1};
            return answer1;
        }
        Arrays.sort(result);
        for(int i=0;i<arr.length;i++){
            if(result[0]==arr[i]){
                continue;  
            }else{
                answer[count++]=arr[i];
            }              
        }
        return answer;
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
