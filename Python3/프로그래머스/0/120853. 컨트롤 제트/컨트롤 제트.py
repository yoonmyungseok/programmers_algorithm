def solution(s):
    answer = 0
    array = s.split(' ')
    for i in range(len(array)):
        if array[i].isalpha():
            answer -= int(array[i-1])
        else:
            answer += int(array[i])
    return answer