//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_simple_step0
//コメント：高速化 模範解答参考
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        var a=new int[n+1];
        boolean sort=true;
       
        for (int i=0;i<n ;i++ )
        {
        a[i+1]=sc.nextInt();
        if(a[i+1]<a[i])
        {
            sort=false;
            break;
        }
        }
        
       
        
        System.out.println( sort?"Yes":"No" );
        
    }
}
//```