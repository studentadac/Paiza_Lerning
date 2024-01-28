#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step1
#コメント：
#```py
n,b=map(int,input().split())

a=set(map(int,input().split()))

print("Yes" if b in a else "No")
#```