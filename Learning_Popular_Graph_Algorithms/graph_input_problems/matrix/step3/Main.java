//言語：Java
//問題URL：
//コメント：
//コード：https://paiza.jp/works/mondai/graph_input_problems/graph_input_problems__adjacency_matrix_step3
//```Java


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for (int i=0;i<n ;i++ )
        for (int j=0;j<n ;j++ )
        {
            ans+=sc.nextInt();
            
            
        }
        
        ans/=2;
        System.out.println(ans);
        
        
    }
}


//```