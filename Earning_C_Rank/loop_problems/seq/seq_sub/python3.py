
#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_sum
#コメント：
#コード：
#```py
input()

a=list(map(int,input().split()))
print(sum(a))
#```


#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_partsum
#コメント：
#コード：
#```py
n,A,B=map(int,input().split())
a=list(map(int,input().split()))
print(sum(a[A-1:B]))
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_multi
#コメント：
#コード：
#```py
n=int(input())
a=[int(x)*2 for x in input().split()]
print(*a, sep="\n")
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_sub
#コメント：
#コード：
#```py
input()
a=list(map(int,input().split()))
b=list(map(int,input().split()))

for i,j in zip(a,b) :
    print(i-j)
#```


#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```
