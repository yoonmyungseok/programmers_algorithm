def solution(A, B):
    answer = 0
    if A == B:
        return 0
    for i in range(-1, -len(A)-1, -1):
        if A[i:]+A[:i] == B:
            answer += 1
            return answer
        else:
            answer += 1
    return -1
    
    