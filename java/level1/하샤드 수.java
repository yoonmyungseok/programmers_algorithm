class Solution {
    public boolean solution(int x) {
        int n=x;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return x%sum==0 ? true : false;  
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
