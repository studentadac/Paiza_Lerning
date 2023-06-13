//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__range_step4
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
       
        
        int []a=new int[n];
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        int ans=0;
        for (int i=0;i<n-2 ;i++ )
        {
           if((a[i] <a[i+1] &&a[i+1]>a[i+2]) ||(a[i] >a[i+1] &&a[i+1]<a[i+2])  )// a_i < a_{ i + 1 } > a_{ i + 2 } または a_i > a_{ i + 1 } < a_{ i + 2 } となる i の個数を出力してください。
           
          ans++;
            
        }
       
                
        System.out.println(ans);        
        
        
        
    }
}
//```