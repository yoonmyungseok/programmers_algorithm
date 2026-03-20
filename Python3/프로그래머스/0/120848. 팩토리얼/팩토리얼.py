def solution(n):
    answer = 0
    p = 1
    i = 1
    while p <= n:
        i+=1
        p*=i
    answer = i-1
    return answer