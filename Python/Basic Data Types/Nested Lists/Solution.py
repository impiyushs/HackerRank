if __name__ == '__main__':
    listt=[[input(), float(input())] for i in range(int(input()))]
    x=sorted(set(l[1] for l in listt))
    sec=x[1]
    for z in sorted(l[0] for l in listt if l[1]==sec):
        print(z)
