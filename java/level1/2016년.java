class Solution {
    public String solution(int a, int b) {
        String[] week={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] day={31,29,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        for(int i=0;i<a-1;i++){
            sum+=day[i];
        }
        int date=(sum+b-1)%7;
        return week[date];
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
