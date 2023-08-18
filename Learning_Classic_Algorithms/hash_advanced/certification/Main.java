//言語：Java
//問題URL：https://paiza.jp/works/mondai/hash_advanced/hash_advanced__certification
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    static long encrypto(String s)
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
        
        return cipher;
        
        
    }
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
       

        int n = sc.nextInt(), m  = sc.nextInt();
        var loginInfo=new HashMap<String,Long>(n);
        
        for (int i=0;i<n ;i++ )
        {
            loginInfo.put(sc.next(),sc.nextLong());
        }
        
        for (int i=0;i<m ;i++ )
        {
            
            String user=sc.next();
            String pass=sc.next();
            
            long  encryptoPass=encrypto(pass);
            
            if( loginInfo.containsKey(user)&&loginInfo.get(user)==encryptoPass )
            {
                System.out.println("Yes");
                
            }
            else
            {
                System.out.println("No");
            }
            
            
            
        }
        
        
       
    }
}



//```