//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__matrix_step3
//コメント： 累積和使えば早いけどやりかた忘れたし制約が小さかったので、から力技で解きました。
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
        int k=sc.nextInt();
        sc.nextLine();

        int[][] a=new int[n][m];
        int ans=0;
        for (int i=0;i<n ;i++ )
        {
            String[] s=sc.nextLine().split(" ");
        a[i]=Arrays.stream(s)
               .mapToInt(Integer::parseInt)
                               .toArray();
       
        
        }
        
            for (int i=0;i<n-k+1 ;i++ )
        {
        
       
        for (int j=0;j<m-k+1 ;j++ ) 
      { int num=0;
            for (int y=0;y<+k ;y++ )
        {
        
        for (int x=0;x<+k ;x++ ) 
      {
          num+=a[y+i][x+j];
       //   System.out.println(num);
      }
            
        } 
          
          
       ans=Math.max(ans,num);     
      }
      
    
      
        }
        
        
        
        System.out.println(ans);
        
    }
}
//```