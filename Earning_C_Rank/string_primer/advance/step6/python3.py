#言語：python3
#問題URL：https://paiza.jp/works/mondai/string_primer/advance_step6
#コメント：
#```py
N=int(input())
q=int(input())

n=[None]*q
c=[None]*q
for i in range(q):
    n[i],c[i]=input().split()

base=input()

ans=list((base*N))
#print(ans)

for i in range(q):
    ans[int(n[i])-1]=c[i]

print("".join(ans))
#```
