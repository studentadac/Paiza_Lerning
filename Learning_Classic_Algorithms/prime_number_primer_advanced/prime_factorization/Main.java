//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer_advanced/prime_number_primer_advanced__prime_factorization
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=100_001;
        var a=new boolean[n];
        Arrays.fill(a,true);
        a[1]=false;
        var set=new LinkedHashSet<Integer>(); //並びありの集合
        for (int i=2;i<n ;i++ )//エラトステネスのふるいを作る
        {
            if(a[i])
            {
            for(int j=i*2;j<n;j+=i)
            {
                a[j]=false;
            }
            set.add(i);//昇順の集合にする
            }
            
        }
        
        int N=sc.nextInt();
        
        first:for(var num:set)
        {
            while(N%num==0)//割り切れるまで繰り返す
            {
                System.out.println(num);
                N/=num;
                if(N==0)
                break first;
                
            }
            
        }
        
        
        
    }
}


//```