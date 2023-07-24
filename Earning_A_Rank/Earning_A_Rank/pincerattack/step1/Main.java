//言語：Java
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_pincerattack_step1
//コメント：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();

        int y=sc.nextInt();
        int x=sc.nextInt();

        var c=new char[h][w];
         for (int i=0;i<h ;i++ )
         {
        
          for (int j=0;j<w ;j++ )
          {
              if(i==y&&j==x  )
              {
               c[i][j]='!';   
              }
            else if(i==y ||j==x )
             {
                 c[i][j]='*';
             }
             else
             {
                 c[i][j]='.';
             }
             
          }
          System.out.println(c[i]);
          
         }
       

      
    }
}
//```