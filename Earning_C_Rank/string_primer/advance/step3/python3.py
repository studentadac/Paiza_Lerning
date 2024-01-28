#言語：python3
#問題URL：https://paiza.jp/works/mondai/string_primer/advance_step3
#コメント：
#```py
import re

s = input()

print(re.sub("[/: ]","\n",s))
#```
