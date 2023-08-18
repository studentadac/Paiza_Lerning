//言語：Java
//問題URL：  https://paiza.jp/works/mondai/hash_advanced/hash_advanced__minimum_complete
//コメント：Bランクはピンキリ
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var line = sc.next().toCharArray();
        
        final int n=6;
        var revLine=new char[n];
        for (int i=0;i<n ;i++ )
        {
            revLine[i]=line[n-i-1];
        }
        var kakeru=1L;
        
        
        
        
        
        
        
        var origin="aaaaaa".toCharArray();
        var ans=0L;
        for (int i=0;i<n ;i++ )
        {
             ans+=(long)(revLine[i]- origin[i])*kakeru;
            kakeru*=n;
            
        }
        
        
        
        
        System.out.println( ans );
    }
}

//```