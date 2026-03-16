def solution(order):
    answer = 0
    number = {3,6,9}
    array = list(map(int,str(order)))
    for i in array:
        if i in number:
            answer+=1
    return answer