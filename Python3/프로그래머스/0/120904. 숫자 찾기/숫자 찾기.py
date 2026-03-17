def solution(num, k):
    answer = 0
    array = list(map(int, str(num)))
    if k in array:
        return array.index(k) + 1
    
    return -1