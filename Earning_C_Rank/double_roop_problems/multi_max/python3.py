#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__print_column
#コメント：
#コード：
#```py
def make_list(s):
    return(list(map(int,s.split())))

n,k=make_list(input())
for _ in range(n):
    print(sum(make_list(input())))
#```


#言語：python3
#問題URL：
#コメント：
#コード：
#```py
def make_list(s):
    return(list(map(int,s.split())))

n=int(input())
for _ in range(n):
    print(sum(make_list(input())[1:]))
#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py
n=int(input())

for i in range(1,n+1):
    for j in range(1,i+1):
        print(j,end=( " "  if j<i else "\n"  ))
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__multi_max
#コメント：
#コード：
#```py
def convert_input_to_int_list():
    return(list(map(int,input().split())))

input()

a=convert_input_to_int_list()
b=convert_input_to_int_list()
max_unm=100*-100
for A in a:
    for B in b:
        max_unm=max(max_unm,A*B)

print(max_unm)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__print_map
#コメント：
#コード：
#```py
def convert_input_to_int_list():
    return(list(map(int,input().split())))

n,k=convert_input_to_int_list()

matrix_a=[None]*n

for i in range(n):
    matrix_a[i]=convert_input_to_int_list()
    
for row in matrix_a:
    print(*row)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__search
#コメント：
#コード：
#```py
def convert_input_to_int_list():
    return(list(map(int,input().split())))

n,k=convert_input_to_int_list()

matrix_a=[None]*n

for i in range(n):
    matrix_a[i]=convert_input_to_int_list()
    
for i in range(n):
    if 1 in matrix_a[i]:
        print(i+1, matrix_a[i].index(1)+1)
        exit()
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__search_max
#コメント：
#コード：
#```py
def convert_input_to_int_list():
    return(list(map(int,input().split())))

n,k=convert_input_to_int_list()

matrix_a=[None]*n

for i in range(n):
    matrix_a[i]=max(convert_input_to_int_list())

print(max(matrix_a))
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__transposition
#コメント：
#コード：
#```py
def convert_input_to_int_list():
    return(list(map(int,input().split())))

n,k=convert_input_to_int_list()

matrix_a=[None]*n
matrix_b=[ [None for _ in range(n)] for _ in range(k)  ]

for i in range(n):
    matrix_a[i]=convert_input_to_int_list()
    for j in range(k):
        matrix_b[j][i]=matrix_a[i][j]

for row in matrix_b:
    print(*row)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__prime_number_easy
#コメント：エラトステネス
#コード：
#```py
n=int(input())

a=[True]*(n+1)

cnt=0

for i in range(2,n+1):
    if a[i]:
        cnt+=1
        for j in range(i*2,n+1,i):
            a[j]=False

print(cnt)

#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__prime_number_easy
#コメント：奇数は除外
#コード：
#```py
n=int(input())

cnt=0
for i in range(2,n+1,2):
    num=i
    while(num%2==0):
        cnt+=1
        num//=2
        
print(cnt)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__cuckoo_clock
#コメント：
#コード：
#```py
for x in range(24):
    for y in range(60):
        
        s=""
        z=x+y
        
        if z%3==0:
            s+="FIZZ"
        if z%5==0:
            s+="BUZZ"
        
        print(s)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__payment
#コメント：
#コード：
#```py
x,y,z=map(int,input().split())

ans=3000
for i in range(z//x+1):
    for j in range((z//y)+1     ):
        
        if(i*x+j*y)>z:
            break
        else:
            ans=min(ans,i+j+z-(i*x+j*y))
    
print(ans)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__triangle
#コメント：
#コード：
#```py
n=int(input())
for i in range(1,n):
    for j in range(1,n):
        k=n-i-j
        if(k>0 and (i*i==j*j+k*k)):

            print("YES")
            exit()

print("NO")
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



