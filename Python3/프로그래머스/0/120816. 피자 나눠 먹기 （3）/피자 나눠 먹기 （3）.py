def solution(slice, n):
    answer = 1
    while slice*answer-n<0:
        answer+=1
    return answer