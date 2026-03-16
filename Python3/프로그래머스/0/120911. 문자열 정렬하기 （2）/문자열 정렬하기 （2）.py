def solution(my_string):
    answer = ''
    str = list(my_string.lower())
    str.sort()
    for i in str:
        answer += i
    return answer