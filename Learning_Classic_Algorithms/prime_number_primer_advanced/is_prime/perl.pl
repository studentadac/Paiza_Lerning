#言語：perl
#問題URL：https://paiza.jp/works/mondai/prime_number_primer_advanced/prime_number_primer_advanced__is_prime
#コメント：
#コード：
#```pl
chomp($N = <STDIN>);
$is_prime=1;
$i=2;
while($i++**2<=$N)
{
    if($N%$i==0)
    {
        $is_prime=0;
        last;
    }
    
    
}
print (($is_prime&&$N!=1?"Yes":"No")."\n"  );
#```