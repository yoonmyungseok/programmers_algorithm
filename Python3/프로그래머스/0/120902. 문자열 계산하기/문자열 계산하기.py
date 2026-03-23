def solution(my_string):
    answer = 0
    calc = 1
    s = my_string.split(' ')
    for i in s:
        if i == '-':
            calc = -1
        elif i == '+':
            calc = 1
        else:
            answer += (int(i)*calc)
    return answer