

#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_simulation_step1
#コメント：
#コード：
#```py

print((10000//13)*13+13)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_simulation_step2
#コメント：
#コード：
#```py
n=int(input())

a,b=map(int,input().split())


p=k=1

cnt=0

while(n>=k):
    k+=p*a
    cnt+=1
    p+=k%b

print(cnt)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_simulation_boss
#コメント：
#コード：
#```py
h=int(input())

cnt=2
h-=2


a=[1,1]
b=[1,1]

while(h>0):
    
    lastA=b[-1]+b[-2]
    
    lastB=a[-1]*2+a[-2]
    
    h-=lastB
    a.append(lastA)
    b.append(lastB)
    
    cnt+=1

#print(*a)
#print(*b)

print(cnt)

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



