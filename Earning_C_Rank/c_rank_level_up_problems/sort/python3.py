



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_sort_step2
#コメント：
#コード：
#```py
n=int(input())


a=sorted(  ( int(input()) for _ in range(n) ),reverse=True  )

print(*a,sep="\n")
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_sort_step3
#コメント：https://qiita.com/t_kanno/items/13dd226e70d080159d97
#コード：
#```py

n=int(input())

a=[ list(map(int,input().split()))  for  _ in range(n) ]
b=sorted(a, key=lambda x:(x[0], x[1]), reverse=True)

for row in b:
    print(*row)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_sort_boss
#コメント：
#コード：
#```py
n=int(input())

a=[ list(map(int,input().split()))  for  _ in range(n) ]
b=sorted(a, key=lambda x:(x[1], x[0]), reverse=True)

for row in b:
    print(*row)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_dictionary_step1
#コメント：
#コード：
#```py
n=int(input())

a=dict(input().split() for _ in range(n))


s=input()
print(a[s])
#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



