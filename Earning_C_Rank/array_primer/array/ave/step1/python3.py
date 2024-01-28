#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_ave_step1
#コメント：https://note.nkmk.me/python-filter-usage/#python3filter
#コード：
#```py
input()
a=list(map(int,input().split()))
for i in filter(lambda x: x >=5 , a):
    print(i)
#```