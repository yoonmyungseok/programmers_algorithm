def solution(polynomial):
    s = polynomial.split(' + ')
    xnum = 0
    inum = 0
    for i in s:
        if i.isdigit():
            inum += int(i)
        else:
            if i == 'x':
                xnum += 1
            else:
                xnum += int(i[:-1])
    if xnum == 0:
        return str(inum)
    elif xnum == 1:
        if inum == 0:
            return 'x'
        else:
            return 'x'+' + '+str(inum)
    else:
        if inum == 0:
            return str(xnum)+'x'
        else:
            return str(xnum)+'x'+' + '+str(inum)