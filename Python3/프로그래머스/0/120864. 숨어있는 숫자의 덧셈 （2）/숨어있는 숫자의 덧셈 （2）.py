def solution(my_string):
    answer = 0
    current = ''
    result = []
    for c in my_string:
        if c.isdigit():
            current += c
        else:
            if current:
                result.append(int(current))
                current = ''
    if current:
        result.append(int(current))
    answer = sum(result)
    return answer