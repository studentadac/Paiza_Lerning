//言語：Java
//問題URL：
//コメント：
//コード：https://paiza.jp/works/mondai/graph_input_problems/graph_input_problems__adjacency_matrix_step2
//```Java


import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        var graph=new int[n+1][n+1];
        for (int i=0;i<m ;i++ )
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a][b]=1;
    //        graph[b][a]=1;
            
        }
        
        for (int i=0;i<n ;i++ )
        for (int j=0;j<n ;j++ )
        {
            System.out.print(graph[i+1][j+1]);
            
            System.out.print(j<n-1?" ":"\n");
            
            
        }
        
        
        
    }
}


//```