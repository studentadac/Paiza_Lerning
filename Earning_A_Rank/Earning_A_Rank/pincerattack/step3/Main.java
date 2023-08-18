//言語：Java
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_pincerattack_step3
//コメント：xとyは逆だけど修正が面倒だったのでそのまま
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        var a=new char[h][w];
        for (int i=0;i<h ;i++ ) 
        {
            for (int j=0;j<w ;j++ ) 
            {
                a[i][j]='.';
            }
            
        }
        
        
        int max=Math.max(h,w);
        for (int i=0;i<max ;i++ ) 
        {
           if(x+i<h)
           {
               if(y+i<w)
               a[x+i][y+i]='*';
                if(y-i>=0)
               a[x+i][y-i]='*';
               
               
           }
            if(x-i>=0 )
           {
               if(y+i<w)
               a[x-i][y+i]='*';
                if(y-i>=0)
               a[x-i][y-i]='*';
               
               
           }
           
           
           
           
        }
        
        
        a[x][y]='!';
        
        for (int i=0;i<h ;i++ ) 
        {
            System.out.println(String.valueOf(a[i]));
            
        }
        
        
        
        
    }
}


//```