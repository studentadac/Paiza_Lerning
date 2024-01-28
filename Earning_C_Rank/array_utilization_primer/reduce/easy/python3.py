#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__reduse_easy
#コメント：
#コード：
#```py
a= [ [ i*j for j in range(1,10)    ] for i in range(1,10)            ]

for matrix in a:
    print(*matrix)
#```