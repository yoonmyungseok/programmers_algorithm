def solution(score):
    answer = []
    avg = [sum(i) / 2 for i in score]
    avg_score = sorted(avg, reverse=True)
    for i in avg:
        answer.append(avg_score.index(i) + 1)
    return answer