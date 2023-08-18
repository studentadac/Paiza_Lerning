//言語：Java
//問題URL：https://paiza.jp/works/mondai/hash_advanced/hash_advanced__tree1
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    
    static String encrypto(String s)
    {
        
        
        final long b=100000007;
        final long mod=1000000007;
        
        var S=s.toCharArray();
       // var SLength=s.length;
        long B=1;
        
        long cipher=0;
        for(int num :     S)
        {
            B=B*b%mod;
            cipher+=num*B%mod;
            cipher%=mod;
            
            
        }
        
        return String.valueOf(cipher);
    }
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var A=new ArrayDeque<String>();
        while(sc.hasNext())
        {
            
            A.add(sc.next());
        }
        while(A.size()!=1)
        {
            var ar=A.poll();
            var al=A.poll();
            
            A.add(encrypto(ar)+encrypto(al)  );
        }
        System.out.println(encrypto(A.peek()));
        
        
        
        
    }
}



//```