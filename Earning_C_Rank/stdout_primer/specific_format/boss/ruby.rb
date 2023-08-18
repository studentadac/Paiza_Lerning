#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_boss
#コメント：
#```rb
h,w,a,b=gets.split(" ").map(&:to_i)

c=format("(%9d, %9d)", a,b) 

d=Array.new(w,c)

e=d.join(' | ')

#puts(e)
f='='*e.size

h.times{|i|
    
    puts(e)
    if(i!=h-1)
        puts(f)
    end

   
    
}

#```