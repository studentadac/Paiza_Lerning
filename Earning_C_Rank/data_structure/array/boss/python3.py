#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__array_boss
#コメント：dict部分はgpt頼み
#コード：
#```py
n,q=map(int,input().split())

a=list(map(int,input().split()))

def order(query):
    global a
    code = {
        "0": lambda x: a.append(int(x)),
        "1": lambda: a.pop(),
        "2": lambda: print(*a)
    }
    code[query[0]](*query[1:])


for _ in range(q):
    query_i =input().split()
    order(query_i)
#```