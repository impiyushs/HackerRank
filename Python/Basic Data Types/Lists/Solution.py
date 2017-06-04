if __name__ == '__main__':
    N = int(input())
    listt=[]
    for i in range (N):
        inp=input().split()
        if(inp[0]=='insert'):
            listt.insert(int(inp[1]), int(inp[2]))
        if(inp[0]=='print'):
            print(listt)
        if(inp[0]=='remove'):
            listt.remove(int(inp[1]))
        if(inp[0]=='append'):
            listt.append(int(inp[1]))
        if(inp[0]=='sort'):
            listt.sort()
        if(inp[0]=='pop'):
            listt.pop()
        if(inp[0]=='reverse'):
            listt.reverse()
