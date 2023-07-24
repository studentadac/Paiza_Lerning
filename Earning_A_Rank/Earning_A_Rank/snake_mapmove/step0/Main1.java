//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_simple_step0
//コメント：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int H, W ,sy, sx;
        char m;
        H=sc.nextInt();
        W=sc.nextInt();
        sy=sc.nextInt();
        sx=sc.nextInt();
        m=sc.next().toCharArray()[0];
         
         switch(m)
         {
             case 'E'->sx++;
             case 'W'->sx--;
             case 'N'->sy--;
             case 'S'->sy++;
             
             
         }
         
         
         
         char[][]c=new char[H][W];
         for (int i=0;i<H ;i++ ) 
         c[i]=sc.next().toCharArray();
         
         
         if( (0<=sy &&sy <H) &&(0<=sx &&sx <W) &&c[sy][sx]=='.'      )
         System.out.println("Yes");
         else
         System.out.println("No");
         
         
         
         
    }
}
//```