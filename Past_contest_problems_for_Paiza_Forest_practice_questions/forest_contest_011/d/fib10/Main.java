//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_011/forest_contest_011__d_fib10
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
/*
フィボナッチ数列の最初の10個のf_1, f_2, ..., f_10を表示してください。

f_1 = 1, f_2 = 1であり、あるn番目のフィボナッチ数は、f_n = f_{n-1} + f_{n-2}で求めることができます。

*/
        Scanner sc = new Scanner(System.in);
        
        final int n=10;
        var fib=new int[n];
        fib[0]=1;
        fib[1]=1;
        
        for (int i=0;i<n ;i++ )
        {
            
            
            if(i>=2){
            fib[i]=fib[i-1]+fib[i-2];
            }
            
            System.out.println(fib[i]);
            
        }
        
        
        
        
    }
}



//```