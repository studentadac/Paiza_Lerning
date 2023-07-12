//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__string_count_step1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var c="bwwbwbbwbwbb".toCharArray();
        final int n=c.length;
        var a=new int [n];
        var s=new int [n+1];
        
        for (int i=0;i<n ;i++ )
        {
            
            if(c[i]=='b')
            a[i]=1;
            
            s[i+1]=s[i]+a[i];
            
        }
        
        System.out.println(s[8]-s[2]);
        
    }
}
//```