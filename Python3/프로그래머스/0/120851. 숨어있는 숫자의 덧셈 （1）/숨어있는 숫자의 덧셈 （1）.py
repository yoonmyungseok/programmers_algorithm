def solution(my_string):
    answer = 0
    for i in my_string:
        if('0'<=i<='9'):
            answer+=int(i)
    return answer