class Solution {
    public int solution(long num) { //홀수면 3을 곱하기때문에 숫자가 커져서 long타입
        int count = 0;
        while(num!=1){
            if(num%2==0){ //짝수
                num=num/2;         
            }else{  //홀수
                num=(num*3)+1;            
            }
            count++;  
            if(count==500){ 
                count=-1;
                break;
            }
        }
        return count;
    }
}
출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
