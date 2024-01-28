#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__string_boss
#コメント：
#```py
h,w,r,c=map(int,input().split())

r-=1
c-=1
board=[None]*h

for i in range(h):
    board[i]=input()



print("Yes" if board[r][c]=="#" else "No")
#```