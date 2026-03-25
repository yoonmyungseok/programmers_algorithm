def solution(dots):
    width = max(dots)[0] - min(dots)[0]
    length = max(dots)[1] - min(dots)[1]
    
    return width*length