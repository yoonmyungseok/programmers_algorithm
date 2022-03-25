class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i=0;i<absolutes.length;i++){
            if(signs[i]==true){
                sum+=absolutes[i];
            }else{
                sum+=(absolutes[i]*-1);
            }
        }
        return sum;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
