#言語：python3
#問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__similar_randamize
#コメント:
#コード：
#```py
x, m, n = map(int, input().split())
#print(x)
#問題文通りに解けばいい、桁あふれに注意
for i in range(1,n+1):
    y=0
    for j in range(1,i+1):
        y+=(x**j)
    y%=m
    print(y)
#```

