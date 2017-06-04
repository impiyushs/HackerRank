if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    x=max(arr)
    count=arr.count(x)
    for i in range(count):
        arr.remove(x)
    print(max(arr))
