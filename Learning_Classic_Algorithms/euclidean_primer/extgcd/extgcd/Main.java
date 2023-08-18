//言語：Java
//問題URL：https://paiza.jp/works/mondai/euclidean_primer/euclidean_primer__extgcd
//コメント：疑似コードの写経
//コード：
//```Java

import java.util.*;
public class Main {
    
    //static 
    static int[] extgcd(int a,int b)
    {
        
        
       
        
        if(b!=0)
        {
            int[] ans=extgcd(b,a%b);
            ans[1]-=(a/b)*ans[2];
            
            int tmp=ans[1];
            ans[1]=ans[2];
            ans[2]=tmp;
            
            return ans;
            
            
        }
        int[] ans={ a,1,0 };
        return ans;
    }
    
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        var ans=extgcd(a,b);
        System.out.println(ans[1]+" "+ans[2]   );
        
        
  
    }
}

/*
// ax + by = gcd(a,b) を満たす x, y と gcd(a,b) を返すプログラム

ectgcd(a, b) {
  if b( != 0) {
    c, y, x = extgcd(b, a % b)
    y -= (a / b) * x
    return c, x, y // 最終的に返される c が gcd(a,b) となる
  }
  return a, 1, 0
}
*/


//```