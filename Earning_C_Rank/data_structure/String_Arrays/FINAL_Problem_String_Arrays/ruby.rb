#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__string_boss
#コメント：
#```rb


h,w,r,c=gets.chomp.split().map(&:to_i)

a=[]

while line=gets
    a.push(line.chomp)
end
#puts(a)

puts(  a[r-1][c-1]=="#"?"Yes":"No"  )
#```