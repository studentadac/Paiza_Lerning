//言語：Java
//問題URL：
//コメント：
//コード：https://paiza.jp/works/mondai/graph_input_problems/graph_input_problems__loops_multiple_edges_step2
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var a=new int[n][n];
        for (int i=0;i<n ;i++ )
        for (int j=0;j<n ;j++ )
        a[i][j]=sc.nextInt();
        
        var ans=new ArrayList<ArrayList<Integer>>((n*n)/2);
        for (int i=0;i<n ;i++ )
        for (int j=0;j<n ;j++ )
        if(j>i&&a[i][j]>1)
        {
            var locale=new ArrayList<Integer>(Arrays.asList((i+1),(j+1)));
            ans.add(locale);
            
       
        }
        
       // final int ansSize=ans.size();
       
       System.out.println(ans.size());
       for(var num : ans)
       {
           System.out.println( num.get(0)+" "+num.get(1) );
       }
       
        
        
    
    }
}



//```