//言語：Java
//問題URL：
//コメント：
//コード：https://paiza.jp/works/mondai/graph_input_problems/graph_input_problems__adjacency_matrix_boss
//
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        var graph=new int[n][n];
     
        for (int i=0;i<n ;i++ )
        for (int j=0;j<n ;j++ )
        {
            
            
            graph[i][j]=sc.nextInt();
           
            
        }
        
        for (int i=0;i<q ;i++ )
        
        {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            System.out.println(graph[a][b]);
        }
        
        
    }
}

```
//