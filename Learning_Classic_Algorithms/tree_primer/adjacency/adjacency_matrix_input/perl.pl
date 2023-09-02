#言語：perl
#問題URL：https://paiza.jp/works/mondai/tree_primer/tree_primer__adjacency_matrix_input
#コメント：
#コード：
#```pl
chomp($N=<>);
#print($N);
@a=();


=pod
for($i=1;$i<=$N;$i++)
{
    for($j=1;$j<=$N;$j++)
    {
    $a[$i][$j]=0;
    }
    
}
=cut



for ($i=0;$i<$N-1;$i++)
{
    #$line=<>;
    @b=glob<>;
    
   #配列の長さは添え字によって変わる
    $a[$b[0]][$b[1]]=1;
    $a[$b[1]][$b[0]]=1;
}


for($i=1;$i<=$N;$i++)
{
    for($j=1;$j<=$N;$j++)
    {
     print(($a[$i][$j]?1:0). (  $j==$N ?"\n":" ")    );
        
    }
    
}
#```