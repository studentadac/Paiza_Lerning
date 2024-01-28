#言語：ruby
#問題URL：https://paiza.jp/works/mondai/forest_contest_011/forest_contest_011__c_robot_movement_2
#コメント:  
#```rb
a=gets.split(" ").map(&:to_i)
#絶対値にして計算を簡単にする
x,y=a.map(&:abs)
#最小値と最大値にする
min,max=[x,y].minmax
#階段状に移動すれば止まることがない
ans=min*2

if min!=max
    #最初の一歩が上か右どちらに移動するかで1減らせる
    #入力例1 5 3 だと上を先にすると 上右上右上右上停上で9マス
    #右を先にすると 右上右上右上停上停上で10マス
    ans+=(max-min)*2-1
end
puts ans
    


#```