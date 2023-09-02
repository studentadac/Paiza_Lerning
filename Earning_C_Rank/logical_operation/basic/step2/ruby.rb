#言語：ruby
#問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step3
#コメント: ヤダモンさんのパクリ
#```rb
a=gets.split(" ").map(&:to_i)
ans= ~a[0] & 0x01
p ans
#```