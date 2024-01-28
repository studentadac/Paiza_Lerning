#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__find_pair
#コメント：
#コード：
#```py
n=int(input())

a=[int(input()) for _ in range(n)]
a.sort()

max_diff=100
ans=0
for i in range(n-1):
    diff=a[i+1]-a[i]
    if a[i+1]-a[i]<max_diff:
        max_diff=a[i+1]-a[i]
        ans=i

print(a[ans])
print(a[ans+1])
    
#```