#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__even_odd
#コメント：
#コード：
#```py
input()
a=[ "odd" if x%2==1 else "even"     for x in  map(int,input().split())]

print(*a,sep="\n")
#```

#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__digit_sum
#コメント：
#コード：
#```py
a=[int(x) for x in list(input())]
print(sum(a))
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__index_multi
#コメント：
#コード：
#```py
n=int(input())

a= [(i+1)*(j)    for i,j in  enumerate(map(int,input().split()))]
print(*a,sep="\n")
#```


#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__div_two
#コメント：
#コード：
#```py
n=int(input())
ans=0
while(1&n==0):
    n=n>>1
    ans+=1

print(ans)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__div_m
#コメント：
#コード：
#```py
n,m=map(int,input().split())

ans=0
while(n%m==0 ):
    n//=m
    ans+=1
print(ans)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__conv_nbase
#コメント：
#コード：
#```py
n,m=map(int,input().split())


if m==10:
    print(n)

else:
    a=[]
    while(n>0):
     a.append(n%m)
     n//=m
    print(*a[::-1],sep="")
#```


#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__inc_percent
#コメント：
#コード：
#```py
a,b=map(int,input().split())
ans=0
while(a<=b):
    a=int(a*1.1)
    ans+=1
print(ans)
#```


#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__factorial
#コメント：
#コード：
#```py
n=int(input())
ans=1
for i in range(n):
    ans*=(i+1)

print(ans)
#```

#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__factorial_zero
#コメント：
#コード：
#```py
n=int(input())
cnt=1
for i in range(n):
    cnt*=(i+1)
    
s=str(cnt)[::-1]

for i in range(len(s)):
    if s[i]!="0":
        print(i)
        exit()
#```


#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__add_maxseq
#コメント：
#コード：
#```py
n=input()

a=[(i+1+j) for i, j in enumerate(map(int,input().split()))   ]
print(max(a))
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__add_minseq
#コメント：
#コード：
#```py
n=input()

a=[(i+1+j) for i, j in enumerate(map(int,input().split()))   ]
print(min(a))
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__add_minseq
#コメント：
#コード：
#```py

#```


#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__seq_one
#コメント：
#コード：
#```py
n=int(input())

a=[i+1  for i,j in enumerate(input().split())  if j=="1"]
print(*a,sep="\n" )
#```


#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__divsor_count
#コメント：
#コード：
#```py
n=int(input())

ans=0
for i in range(n):
    if n%(i+1)==0:
        ans+=1
print(ans)
#```


#言語：python3
#問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__divsor_print
#コメント：
#コード：
#```py
n=int(input())

ans=0
for i in range(n):
    if n%(i+1)==0:
        print(i+1)

#```


