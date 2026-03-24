def solution(quiz):
    answer = []
    
    for i in quiz:
        s = i.split()
        if s[1] == '+':
            valid = int(s[0]) + int(s[2]) == int(s[4])
        else:
            valid = int(s[0]) - int(s[2]) == int(s[4])
        answer.append("O" if valid else "X")
    return answer