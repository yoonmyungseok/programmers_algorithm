class Solution {
    public double solution(int[] arr) {
        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        double answer = (double)sum/arr.length;
        return answer;
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
