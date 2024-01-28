//言語：Java
//問題URL：https://paiza.jp/works/mondai/graph_input_problems/graph_input_problems__loops_multiple_edges_step1
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
        int cnt=0;
        var a=new ArrayList<Integer>(n);
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n; j++ )
            {
                int g=sc.nextInt();
                
                if(g==1&&i==j)
                {
                    cnt++;
                    a.add(i+1);
                }
                
            }
        }
        
        System.out.println(cnt);
        for(var num:a)
        {
            System.out.println(num);
        }
     
        
    }
    
}
//```