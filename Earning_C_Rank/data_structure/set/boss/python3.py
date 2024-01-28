#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_boss
#コメント：
#```py
n=input()

a=set(map(int,input().split()))
b=set(map(int,input().split()))
c=a | b

ans=sorted(c)
print(*ans)
#```