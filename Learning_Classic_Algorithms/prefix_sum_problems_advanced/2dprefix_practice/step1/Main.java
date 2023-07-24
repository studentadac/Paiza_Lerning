//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__2dprefix_practice_step1
//コメント：模範解答参考
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
       int n,w,h;
       n=sc.nextInt();
       w=sc.nextInt();
       h=sc.nextInt();
       int N=n,W=w,H=h;
       
       var a =new int[n][n];
       var s=new int[n+1][n+1];
       for (int i=0;i<n ;i++ ) 
       {
           for (int j=0;j<n ;j++ ) 
           {
               a[i][j]=sc.nextInt();
           }
       }
       
       for (int i = 0; i < N; i++) {
    for (int j = 0; j < N; j++) {
      s[i + 1][j + 1] = s[i + 1][j] + s[i][j + 1] - s[i][j] + a[i][j];
    }
  }

       int max_value = 0;
  for(int x = 0; x < N - W + 1; x++) {
    for(int y = 0; y < N - H + 1; y++) {
      max_value = Math.max(max_value, s[y + H][x + W] - s[y][x + W] - s[y + H][x] + s[y][x]);
    }
  }
  
  System.out.println(max_value);
       
    }
}
//```