def solution(n):
    d = 2
    answer = []
    while n!=1:           
        if n%d==0:                 
            n=n//d
            if d not in answer:
                answer.append(d)      
        else:                             
            d +=1      
    return answer