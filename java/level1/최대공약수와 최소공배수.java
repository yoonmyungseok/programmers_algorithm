class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a=n;
        int b=m;
        while(b!=0){
		    int r = a%b;
		    a=b;
		    b=r;
            answer[0]=a;
	    } 
        answer[1]=n*m/answer[0];
        return answer;
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
