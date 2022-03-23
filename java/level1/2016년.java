import java.time.*;
class Solution {
  public String solution(int a, int b) {
      return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
  }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
