//言語：Java
//問題URL：https://paiza.jp/works/mondai/graph_input_problems/graph_input_problems__adjacency_list_step2
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
        var tree=new ArrayList<ArrayList<Integer>>(n+1);
        for (int i=0;i<n+1 ;i++ )
        {
            tree.add(new ArrayList<Integer>(m));
            
        }
        
   
        for (int i=0;i<m ;i++ )
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            tree.get(a).add(b);
      
         
        
            
            
        }
        
        for (int i=1;i<=n ;i++ ) 
        {
            var node=tree.get(i);
            final int nodeSize=node.size();
            
            if(nodeSize==0)
            System.out.println(-1);
            else
            {
              for (int j=0;j<nodeSize ;j++ )
              {
                  System.out.print(node.get(j));
                  System.out.print(j<nodeSize-1?" ":"\n");
                  
              }
            }
            
        }
        
        
    }
}



//```