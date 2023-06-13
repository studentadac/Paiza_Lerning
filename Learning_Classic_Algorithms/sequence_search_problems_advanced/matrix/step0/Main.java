//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__matrix_step0
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        char[][] a=new char[n][m];
        int ans=0;
        for (int i=0;i<n ;i++ )
        {
        a[i]=sc.next().toCharArray();
        for (int j=0;j<m ;j++ ) 
        if(a[i][j]=='.')
        ans++;
        
        }
        
        
        System.out.println(ans);
        
    }
}
//```