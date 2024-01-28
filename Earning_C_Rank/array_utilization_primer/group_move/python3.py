#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__group_move
#コメント：
#コード：
#```py
n,q=map(int,input().split())
a=[i+1 for i in range(n)]


'''
・swap A B
先頭から A 番目の人と、先頭から B 番目の人の位置を入れ替える。
・reverse
列の前後を入れ替える。
・resize C
先頭から C 人を列に残し、それ以外の人を全員列から離れさせる。ただし、列が既に C 人以下の場合、何も行わない。
'''

for _ in range(q):
    s=input().split()
    if s[0]=="swap":
        A=int(s[1])-1
        B=int(s[2])-1
        a[A],a[B]=a[B],a[A]
    elif s[0]=="reverse":
        a.reverse()
    else:
        C=int(s[1])
        if len(a)>C:
            a=a[:C]
        
print(*a,sep="\n")        
        
#```