#言語：python3
#問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__perfect_shuffle
#コメント：デキューは使わなくてもよかった、変数をもっと使ったほうが奇麗にできた
#コード：
#```py
k=int(input())
mark=["S","H","D","C"]

deck=[None]*(4*13)

for i in range(4):
    for j in range(13):
        #print(i*13+j)
        deck[i*13+j]=mark[i]+"_"+str(j+1)
        
from collections import deque
for _ in range(k):
    upperdeck=deque(deck[:26])
    lowerdeck=deque(deck[26:])
    newdeck=deque()
    for _ in range(26):
        
        newdeck.appendleft(lowerdeck.pop())
        newdeck.appendleft(upperdeck.pop())
     
    
    deck=list(newdeck)
    

     

print(*deck,sep="\n")


#```

#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```


