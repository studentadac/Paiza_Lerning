#言語：ruby
#問題URL：https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__arithmetic_step6
#コメント: 
#```rb
a,b,c,d=gets.split().map(&:to_i)
ans=((a+b)*c)**2%d

printf("%d\n",ans)

#```