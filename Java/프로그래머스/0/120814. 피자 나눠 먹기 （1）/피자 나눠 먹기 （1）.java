class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n/7 + (n%7 == 0 ? 0 : 1);
        return answer;
    }
}