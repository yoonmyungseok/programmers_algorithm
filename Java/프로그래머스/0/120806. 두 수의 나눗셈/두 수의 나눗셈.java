class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double doubleNum1 = num1;
        double doubleNum2 = num2;
        answer = (int) (doubleNum1 / doubleNum2 * 1000);
        return answer;
    }
}