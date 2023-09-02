#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step3
#コメント: 
#```rb

n=gets.to_i
a=gets.split().map(&:to_i)

require 'set'
s=Set.new
s.add(a[0])
(n-1).times{|i|
    
    puts s.add?(a[i+1])?"No":"Yes"
   # if add? (num)
   #     puts "Yes"
   # else
   #     puts "No"
   #     s.add(num)
   #end
   
}


#```