//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__posting_fee
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        long y=sc.nextLong();
        long x=sc.nextLong();
        long h=sc.nextLong();
        int n=5;
        
        long [] l=new long[n+1];
        for (int i=0;i<n ;i++ ) 
        l[i+1]=sc.nextLong();
        
        long [] m=new long[n+2];
        for (int i=0;i<n+1 ;i++ ) 
        m[i+1]=sc.nextLong();
        
        long ans=0;
        if(h<=l[1])
        {
            
            if(Math.max(x,y)<=l[2])
            ans=m[1];
            else if((x+y)<=l[3])
            ans=m[2];
            else
            ans=m[3];
            
            
            
        }
        
        else
        {
            if(Math.max(Math.max(x,y),Math.max(y,h))<=l[4])
            ans=m[4];
            else if((x+y+h)<=l[5])
            ans=m[5];
            else
            ans=m[6]*y*x*h;
            
        }
        System.out.println(ans);
        
    }
}


//```