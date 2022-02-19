class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
		int y = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
				p++;
			if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
				y++;
		}
		if (p == y)
			answer = true;
		else
			answer = false;

		return answer;
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
