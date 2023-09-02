#言語：perl
#問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__grothendieck
#コメント：
#コード：
#```pl
#chomp($N = <STDIN>);
#グロタンディ-ク素数
$N=57;

#perlの真偽値は0か0でないか、この場合は真
#素数であるか
$is_prime=1;

#2から$Nの平方根までで割り切れる数があったら素数ではない
$i=2;
while($i++**2<=$N)
{
    if($N%$i==0)
    {
        $is_prime=0;
        last;
    }
    
    
}
#$N==1なら素数ではない
print (($is_prime&&$N!=1?"YES":"NO")."\n"  );
#```