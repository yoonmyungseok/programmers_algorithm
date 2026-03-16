def solution(my_string):
    alp = 'aeiou'
    for i in alp:
        my_string = my_string.replace(i,'')
    return my_string