class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int cnt=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                cnt++;
            }
        }
        answer=new int[cnt];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                answer[j++]=arr[i];
            }
        }
        answer[cnt-1]=arr[arr.length-1];
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
