//言語：Java
//問題URL：https://paiza.jp/works/mondai/tree_primer/tree_primer__adjacency_list_input
//コメント：きれいに書けなかったです
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var a=new int[n][2];
        var b=new int[n+1][n+1];
        for (int i=0;i<n-1 ;i++ )
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            
            b[a[i][0]][a[i][1]]++;
           b[a[i][1]][a[i][0]]++;
            
            
        }
        
        for (int i=1;i<=n ;i++ )
        {
            boolean first=true;
            for (int j=1;j<=n ;j++ )
            if(b[i][j]==1)
            {
            System.out.print( (first?"":" ") +  j);
            first=false;
            }
            
            System.out.println();
            
     //       System.out.println();
    
        }
        
        
        
        
        
    }
}
//```