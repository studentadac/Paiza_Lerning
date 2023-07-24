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
        
        int n=sc.nextInt();
        var origin=new int[n];
        var sorted=new int[n];
        for (int i=0;i<n ;i++ )
        sorted[i]=origin[i]=sc.nextInt();
        
        Arrays.sort(sorted);
        
        System.out.println( Arrays.equals(origin,sorted)?"Yes":"No" );
        
    }
}
//```